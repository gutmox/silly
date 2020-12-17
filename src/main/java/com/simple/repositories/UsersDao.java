package com.simple.repositories;

import com.simple.api.domain.Subscription;
import com.simple.api.domain.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersDao {

	private Map<User, List<Subscription>> usersSubscriptions = new HashMap<>();
	private List<User> agents = new ArrayList<>();

	public void upsert(User user, List<Subscription> subscriptions) {
		if (user.isAgent()){
			agents.add(user);
		}
		usersSubscriptions.put(user, subscriptions);
	}

	public User getAgent(String userName) {
		return agents.stream().filter(user -> user.getUserName().equals(userName)).findFirst().orElse(null);
	}

	public List<Subscription> getUserSubscriptions(User user) {
		return usersSubscriptions.get(user);
	}
}
