package io.muenchendigital.digiwf.s3.integration.application.port.in;

import io.muenchendigital.digiwf.s3.integration.adapter.in.streaming.CreatePresignedUrlEvent;
import io.muenchendigital.digiwf.s3.integration.domain.model.PresignedUrl;
import org.springframework.lang.NonNull;

import javax.validation.Valid;
import java.util.List;

public interface CreatePresignedUrlsInPort {
  /**
   * Create pre-signed URLs.
   *
   * @param event event containing the request.
   * @return resulting variable map.
   * @throws FileSystemAccessException                         on S3 errors.
   * @throws javax.validation.ConstraintViolationException if the request is not valid.
   */
  @NonNull
  List<PresignedUrl> createPresignedUrls(@Valid CreatePresignedUrlEvent event) throws FileSystemAccessException;
}