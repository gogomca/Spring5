package es.gogomca.repository;

import java.util.Optional;

import es.gogomca.domain.Project;

public interface ProjectRepository {
	Optional<Project> findById(long id);
	Project save(Project p);
}
