package es.gogomca.repository.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import es.gogomca.domain.Project;
import es.gogomca.repository.ProjectRepository;

public class ProjectRepositoryImpl implements ProjectRepository {
	List<Project> projects = new ArrayList<Project>();

	@Override
	public Optional<Project> findById(long id) {
		return projects.stream().filter(p -> p.getId() == id).findFirst();
	}

	@Override
	public Project save(Project project) {
		Optional<Project> retrievedProject = findById(project.getId());
		if (!retrievedProject.isPresent()) {
			projects.add(project);
		} else {
			// TODO Why does he remove the existing Project? It is the same that the
			// provided one!!
//			projects.remove(retrievedProject.get());
			projects.remove(project);
			// TODO WTF is this? Why does he consider this constructor is really necessary?
//			projects.add(new Project(p));
			projects.add(project);
		}
		// TODO Why does he require to return the provided Project which in addition has not been modified?
		return project;
	}

}
