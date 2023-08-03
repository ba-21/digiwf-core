package de.muenchen.oss.digiwf.shared.file.presignedUrlAdapters;

import de.muenchen.oss.digiwf.process.instance.process.properties.S3Properties;
import de.muenchen.oss.digiwf.s3.integration.client.repository.presignedurl.PresignedUrlRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpServerErrorException;

/**
 * Fetch presigned urls for file deletion
 *
 * @author ext.dl.moesle
 */
@Component
@Slf4j
@RequiredArgsConstructor
public class DeletePresignedUrlAdapter implements PresignedUrlAdapter {

    private final PresignedUrlRepository presignedUrlRepository;
    private final S3Properties s3Properties;


    @Override
    public String getPresignedUrl(final String pathToFile, final int expireInMinutes) throws HttpServerErrorException {
        return this.getPresignedUrl(this.s3Properties.getHttpAPI(), pathToFile, expireInMinutes);
    }

    @Override
    public String getPresignedUrl(final String documentStorageUrl, final String pathToFile, final int expireInMinutes) {
        try {
            return this.presignedUrlRepository.getPresignedUrlDeleteFile(pathToFile, expireInMinutes, documentStorageUrl);
        } catch (final Exception ex) {
            log.error("Getting presigned url for deleting file {} failed: {}", pathToFile, ex);
            throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, String.format("Getting presigned url for deleting file %s failed", pathToFile));
        }
    }

    @Override
    public boolean isResponsibleForAction(final PresignedUrlAction action) {
        return action.equals(PresignedUrlAction.DELETE);
    }
}