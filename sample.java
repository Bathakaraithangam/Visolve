package com.visolve;


public class Choc {
	
	public static void main(String args[]) {
		int packet = 6;
		int c[] = {3, 4, 5, 4, 5, 3};
		
		boolean bowl[][] = new boolean[5][5];
		
		int b=0; 
		for(int i=0; i<packet; i++) {
			int pos=0;
			for(int j=0; j<c[i]; j++) {
				//System.out.println(bowl[b][pos]);
				//				while(bowl[b][pos]) {
				//									pos++;
				//														if(pos==5) {
				//																				b=(b+1)%5;
				//																										pos=0;
				//																															}
				//																																			}
				//																																							//System.out.println(b + "," + pos);
				//																																											bowl[b][pos]=true;
				//																																															pos++;
				//																																																			if(pos==5 && i>=5) {
				//																																																								b=(b+1)%5;
				//																																																													pos=0;
				//																																																																	}
				//																																																																				}
				//																																																																							
				//																																																																										b=(b+1)%5;
				//																																																																												}
				//																																																																														
				//																																																																																for(int i=0; i<5; i++) {
				//																																																																																			for(int j=0; j<5; j++) {
				//																																																																																							int result = bowl[i][j]?1:0;
				//																																																																																											System.out.print(result + " ");
				//																																																																																														}
				//																																																																																																	System.out.println();			
				//																																																																																																			}
				//																																																																																																				
				//																																																																																																					}
				//																																																																																																					}
				//
