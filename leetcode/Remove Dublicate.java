

public static int sum(int [] num) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i=0; i<num.length;i++) {
			hs.add(num[i]);
		}
		for(int ans:hs) {
		
			System.out.println(ans);
		}
		return 0;
		
		
		
	}
}
