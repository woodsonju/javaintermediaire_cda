package fr.dawan.javaintermediaire.solid.dependencyinversion.good;

import fr.dawan.javaintermediaire.solid.dependencyinversion.bad.User;

public interface IUserRepository {
	public User findById(long id);
}
