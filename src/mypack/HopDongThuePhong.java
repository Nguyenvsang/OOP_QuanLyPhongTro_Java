package mypack;

public class HopDongThuePhong {
	// khoa chinh soHDThue
    public String soHDThue;
    // khoa ngoai maKH va maNV
    public String maKH;
    public String maNV;
    // mot hop dong co mot khach va mot nhan vien thuc hien
    public Khach khach;
    public NhanVien nhanVien;
    public ChiTietHDThuePhong chitiethd;
    // Các getter setter
    public String getSoHDThue() {
		return this.soHDThue;
	}
    public void setSoHDThue(String soHDThue) {
		this.soHDThue=soHDThue;
	}
    
    public String getMaKH() {
		return this.maKH;
	}
    public void setMaKH(String maKH) {
		this.maKH=maKH;
	}
    
    public String getMaNV() {
		return this.maNV;
	}
    public void setMaNV(String maNV) {
		this.maNV=maNV;
	}
    
    public Khach getKhach() {
		return this.khach;
	}
    public void setKhach(Khach khach) {
		this.khach=khach;
	}
    
    public NhanVien getNhanVien() {
		return this.nhanVien;
	}
    public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien=nhanVien;
	}
    
    public ChiTietHDThuePhong getChitiethd() {
		return this.chitiethd;
	}
    public void setChitiethd(ChiTietHDThuePhong chitiethd) {
		this.chitiethd=chitiethd;
	}
    // constructor
    public HopDongThuePhong() { }
    public HopDongThuePhong(HopDongThuePhong hd)
    {
        this.soHDThue = hd.soHDThue;
        this.maKH = hd.maKH;
        this.maNV = hd.maNV;
        this.khach = hd.khach;
        this.nhanVien = hd.nhanVien;
        this.chitiethd = hd.chitiethd;
    }
    public HopDongThuePhong(String soHDThue, String maKH, String maNV, Khach khach, NhanVien nhanVien, ChiTietHDThuePhong chitiethd)
    {
        this.soHDThue = soHDThue;
        this.maKH = maKH;
        this.maNV = maNV;
        this.khach = khach;
        this.nhanVien = nhanVien;
        this.chitiethd = chitiethd;
    }
}
