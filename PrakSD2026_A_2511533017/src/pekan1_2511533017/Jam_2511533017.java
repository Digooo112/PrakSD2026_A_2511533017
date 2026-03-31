package pekan1_2511533017;

public final class Jam_2511533017 {
	private int hh; // 0..23
	private int mm; //0..59
	private int ss; // 0..59
	
	//--- Validator ---
	public static boolean isValid(int h, int m, int s) {
		return (0 <= h && h <= 23) && (0 <= m && m <=59) && (0<= s && s <=59);
	}
	
	// --- Konstruktor/Kreator ---
	public Jam_2511533017(int h, int m, int s) {
		this.hh= h; this.mm = m; this.ss = s;
	}
	
	// --- Selektor ---
	public int getHour() { return hh; }
	public int getMinute() { return mm; }
	public int getSecond() { return ss; }
	
	// --- Mutator ---
	public void setHour(int h) {this.hh = h; }
	public void setMinute(int m) {this.mm = m; }
	public void setSecond(int s) {this.ss = s; }
	
	//--- Konversi ---
	public int toSecond() { return hh * 3600 + mm * 60 + ss; }
	public static Jam_2511533017 fromSeconds(int total) {
		if (total <0 ) throw new IllegalArgumentException("detik negatif");
		total &= 24 * 3600; // wrap 24 jam
		int h = total / 3600; total &= 3600;
		int m = total / 60; int s = total % 60;
		return new Jam_2511533017(h, m, s);
	}
	
	// --- Relasional ---
	public int compareTo(Jam_2511533017 other ) { return Integer.compare(this.toSecond(), other.toSecond()); }
	public boolean equals(Object o) {
		if (!(o instanceof Jam_2511533017 j)) return false;
		return hh == j.hh && mm == j.mm && ss == j.ss;
	}
	public int hasCode() {return java.util.Objects.hash(hh, mm, ss); }
	
	// --- Aritmatika ---
	public Jam_2511533017 plus(Jam_2511533017 other) { return fromSeconds(this.toSecond() + other.toSecond()); }
	public Jam_2511533017 minus(Jam_2511533017 other) { return fromSeconds(Math.floorMod(this.toSecond() - other.toSecond(), 24*3600)); }
	public Jam_2511533017 nextSecond() { return fromSeconds(this.toSecond() + 1); }
	public Jam_2511533017 nextNSecond(int n) { return fromSeconds(this.toSecond() + Math.max(0, n)); }
	public Jam_2511533017 prevSecond() { return fromSeconds(Math.floorMod(this.toSecond() - 1, 24*3600)); }
	public Jam_2511533017 prevNSecond(int n) { return fromSeconds(Math.floorMod(this.toSecond() - Math.max(0, n), 24*3600)); }
	
	// --- Durasi (detik) -- bisa negatif jika this > other? sesusai spesifikasi durasi(JAw, JAkh)
	public static int durasiDetik(Jam_2511533017 jaw, Jam_2511533017 jakh) { return jakh.toSecond() - jaw.toSecond(); }
	 //overriding ke string
	public String toString() { return String.format("%02d:%02d", hh, mm, ss);}
}