package oop;

public class mobil {

	    private String buatan;
	    private String model;
	    private int tahun;
	    
	    public mobil(String buatan, String model, int tahun) {
	        this.buatan = buatan;
	        this.model = model;
	        this.tahun = tahun;
	    }
	    
	    public void mulai() {
	        System.out.println("mobil cepat " + buatan + " " + model + " mulai.");
	    }
	    
	    public void berhenti() {
	        System.out.println("mobil cepat " + buatan + " " + model + " berhenti.");
	    }
	    
	    public static void main(String[] args) {
	        mobil mobilsaya = new mobil("mazda", "RX 7", 2021);
	        mobilsaya.mulai();
	        mobilsaya.berhenti();
	    }
	

}
