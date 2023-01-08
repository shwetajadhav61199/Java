class GarbageColl{
	public void finalize(){
		System.out.println("Finalized Method!");
		}
	public static void main(String args[]){
		GarbageColl cd1 = new GarbageColl();
		GarbageColl cd2 = new GarbageColl();
		
		cd1 = null;
		cd2 = null;
		
		System.out.println("Object Destroyed!");

		System.gc();
	}
}
