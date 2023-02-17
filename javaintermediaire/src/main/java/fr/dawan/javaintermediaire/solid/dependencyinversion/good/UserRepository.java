package fr.dawan.javaintermediaire.solid.dependencyinversion.good;

import fr.dawan.javaintermediaire.solid.dependencyinversion.good.User;

public class UserRepository implements IUserRepository{

	@Override
	public User findById(long id) {
		System.out.println("findById...");
		return null;
	}

}
