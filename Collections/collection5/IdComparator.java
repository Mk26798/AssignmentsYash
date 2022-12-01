package com.yash.collection5;

import java.util.Comparator;

public class IdComparator implements Comparator<Iteams> {

	@Override
	public int compare(Iteams o1, Iteams o2) {

		if (o1.getItemId() == o2.getItemId())
			return 0;
		else if (o1.getItemId() > o2.getItemId())
			return 1;

		else
			return -1;

	}

}
