package com.simple.provision;

import com.simple.api.domain.Subscription;
import java.util.List;

public class Provisioner {

	public void provision(List<Subscription> subscriptions) {
		for (Subscription subscription : subscriptions) {
			if (subscription.getSubscriptionType().equals("TV")){
				//TODO: call provider
			} else if (subscription.getSubscriptionType().equals("FFTH")){
				//TODO: call provider
			} else if (subscription.getSubscriptionType().equals("ADSL")){
				//TODO: call provider
			} else if (subscription.getSubscriptionType().equals("Energy")){
				//TODO: call provider
			} else if (subscription.getSubscriptionType().equals("Mobile")){
				//TODO: call provider
			} else if (subscription.getSubscriptionType().equals("Broadband")){
				//TODO: call provider
			}
		}
	}
}
