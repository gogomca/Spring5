package es.gogomca.service;

import java.util.Optional;

import es.gogomca.domain.Project;

public interface ProjectService {
	Optional<Project> findById(long id);

	Project save(Project p);
}
