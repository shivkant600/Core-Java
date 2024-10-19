package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Contestanttest {
	public static void main(String[] args) {
		List<Contestant> l = new ArrayList<Contestant>();
		l.add(new Contestant("ram", "9912345678"));
		l.add(new Contestant("sdhyam", "2558787812"));
		l.add(new Contestant("rohit", "8556666679"));
		l.add(new Contestant("nitin", "9912345678"));
		l.add(new Contestant("invalidno", "11"));

		System.out.println("--phone number-----");
		l.stream().map(e -> e.phone).forEach(System.out::println);

		System.out.println("---name----");
		l.stream().map(e -> e.name).forEach(System.out::println);

		System.out.println("--remove duplicate number");
		l.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(System.out::println);

		System.out.println("suffle phone no");

		l.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).forEach(System.out::println);

	}
}
