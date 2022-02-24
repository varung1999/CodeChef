Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t--!=0)
		{
			String inp = sc.next();
			StringBuilder sb = new StringBuilder();
			sb.append(inp);
			sb.reverse();
			int n = inp.length();
			
			
			int i=0;
			int j=0,ans=0;
			
			while(i<inp.length())
			{
				if(inp.charAt(i)==sb.charAt(j))
				{
					j++;
				}
				else
				{
					ans++;
				}
				i++;
			}
			System.out.println(ans);
			
		}
