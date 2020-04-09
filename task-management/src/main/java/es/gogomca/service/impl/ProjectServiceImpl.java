package es.gogomca.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import es.gogomca.domain.Project;
import es.gogomca.repository.ProjectRepository;
import es.gogomca.service.ProjectService;

public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public Optional<Project> findById(long id) {
		return projectRepository.findById(id);
	}

	@Override
	public Project save(Project p) {
		return projectRepository.save(p);
	}

}
