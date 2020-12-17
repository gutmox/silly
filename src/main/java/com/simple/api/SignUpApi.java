package com.simple.api;

import com.simple.api.domain.Subscription;
import com.simple.api.domain.User;
import com.simple.provision.Provisioner;
import com.simple.repositories.UsersDao;
import java.util.List;

public class SignUpApi {

	private UsersDao usersDao;

	private Provisioner provisioner;

	public SignUpApi(UsersDao usersDao) {
		this.usersDao = usersDao;
	}

	public void signUp(User user, List<Subscription> subscriptions){
		usersDao.upsert(user, subscriptions);
		provisioner.provision(subscriptions);
	}

	public User getAgent(String userName){
		return usersDao.getAgent(userName);
	}

	public List<Subscription> getUserSubscriptions(User user){
		return usersDao.getUserSubscriptions(user);
	}
}
