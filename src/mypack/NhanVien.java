package mypack;

import java.util.List;
import java.util.GregorianCalendar;

public class NhanVien {
	// khoa chinh maNV
    public String maNV;
    public String hoTen;
    public String gioiTinh;
    public GregorianCalendar ngaySinh;
    public String cCCD;
    public String queQuan;
    // danh sach hop dong thue phong ma moi nhan vien dam nhiem
    public List<HopDongThuePhong> dsHDTP_nhanvien;
    // Các getter setter
    public String getMaNV() {
		return this.maNV;
	}
    public void setMaNV(String maNV) {
		this.maNV=maNV;
	}
    
    public String getHoTen() {
		return this.hoTen;
	}
    public void setHoTen(String hoTen) {
		this.hoTen=hoTen;
	}
    
    public  String getGioiTinh() {
		return this.gioiTinh;
	}
    public void setGioiTinh(String gioiTinh) {
		this.gioiTinh=gioiTinh;
	}
    
    public GregorianCalendar getNgaySinh() {
		return this.ngaySinh;
	}
    public void setNgaySinh(GregorianCalendar ngaySinh) {
		this.ngaySinh=ngaySinh;
	}
    
    public String getCCCD() {
		return this.cCCD;
	}
    public void setCCCD(String cCCD) {
		this.cCCD=cCCD;
	}
    
    public String getQueQuan() {
		return this.queQuan;
	}
    public void setQueQuan(String queQuan) {
		this.queQuan=queQuan;
	}
    
    public List<HopDongThuePhong> getDsHDTP_nhanvien(){
    	return this.dsHDTP_nhanvien;
    }
    public void setDsHDTP_nhanvien(List<HopDongThuePhong> dsHDTP_nhanvien) {
		this.dsHDTP_nhanvien=dsHDTP_nhanvien;
	}
    // constructor
    public NhanVien() { }
    public NhanVien(NhanVien nhanVien)
    {
        this.maNV = nhanVien.maNV;
        this.hoTen = nhanVien.hoTen;
        this.gioiTinh = nhanVien.gioiTinh;
        this.ngaySinh = nhanVien.ngaySinh;
        this.cCCD = nhanVien.cCCD;
        this.queQuan = nhanVien.queQuan;
        this.dsHDTP_nhanvien = nhanVien.dsHDTP_nhanvien;
    }
    public NhanVien(String maNV, String hoTen, String gioiTinh, GregorianCalendar ngaySinh, String cCCD, String queQuan, List<HopDongThuePhong> dsHDTP_nhanvien)
    {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.cCCD = cCCD;
        this.queQuan = queQuan;
        this.dsHDTP_nhanvien = dsHDTP_nhanvien;
    }
}
