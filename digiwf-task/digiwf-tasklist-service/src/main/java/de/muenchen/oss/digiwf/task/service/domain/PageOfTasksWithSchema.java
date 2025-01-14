package de.muenchen.oss.digiwf.task.service.domain;

import lombok.Data;

import java.util.List;

@Data
public class PageOfTasksWithSchema {
  private final List<TaskWithSchemaRef> tasks;
  private final Integer totalElementsCount;
  private final PagingAndSorting pagingAndSorting;
}
