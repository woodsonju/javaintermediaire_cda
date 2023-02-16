package fr.dawan.javaintermediaire.solid.dependencyinversion.good;

import fr.dawan.javaintermediaire.solid.dependencyinversion.bad.User;

public class UserRepository implements IUserRepository{

	@Override
	public User findById(long id) {
		System.out.println("findById...");
		return null;
	}

}
