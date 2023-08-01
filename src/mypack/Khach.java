package mypack;

import java.util.List;
import java.util.GregorianCalendar;

public class Khach {
	// khoa chinh maKH
    public String maKH;
    // khoa ngoai maloaiKH
    public String maloaiKH;
    public String hoTen;
    public String gioiTinh;
    public GregorianCalendar ngaySinh;
    public String cCCD;
    public String queQuan;
    public String ngheNghiep;
    // 
    public LoaiKH nhomloaiKH;
    // mot khach co the co nhieu hop dong thue phong
    public List<HopDongThuePhong> dshdthuephong_khach;
    // Các getter setter
    public String getMaKH() {
		return this.maKH;
	}
    public void setMaKH(String maKH) {
		this.maKH=maKH;
	}
    
    public String getMaloaiKH() {
		return this.maloaiKH;
	}
    public void setMaloaiKH(String maloaiKH) {
		this.maloaiKH=maloaiKH;
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
    
    public String getNgheNghiep() {
		return this.ngheNghiep;
	}
    public void setNgheNghiep(String ngheNghiep) {
		this.ngheNghiep=ngheNghiep;
	}
    
    public LoaiKH getNhomLoaiKH() {
		return this.nhomloaiKH;
	}
    public void setNhomLoaiKH(LoaiKH nhomLoaiKH) {
		this.nhomloaiKH=nhomLoaiKH;
	}
    
    public List<HopDongThuePhong> getDshdthuephong_khach(){
    	return this.dshdthuephong_khach;
    }
    public void setDshdthuephong_khach(List<HopDongThuePhong> dshdthuephong_khach) {
		this.dshdthuephong_khach=dshdthuephong_khach;
	}
    // constructor
    public Khach() { }
    public Khach(Khach khach)
    {
        this.maKH = khach.maKH;
        this.maloaiKH = khach.maloaiKH;
        this.hoTen = khach.hoTen;
        this.gioiTinh = khach.gioiTinh;
        this.ngaySinh = khach.ngaySinh;
        this.cCCD = khach.cCCD;
        this.queQuan = khach.queQuan;
        this.ngheNghiep = khach.ngheNghiep;
        this.nhomloaiKH = khach.nhomloaiKH;
        this.dshdthuephong_khach = khach.dshdthuephong_khach;
    }
    public Khach(String maKH,String maloaiKH, String hoTen, String gioiTinh, GregorianCalendar ngaySinh, String cCCD, String queQuan, String ngheNghiep, LoaiKH nhomloaiKH,
        List<HopDongThuePhong> dshdthuephong_khach)
    {
        this.maKH = maKH;
        this.maloaiKH = maloaiKH;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.cCCD = cCCD;
        this.queQuan = queQuan;
        this.ngheNghiep = ngheNghiep;
        this.nhomloaiKH = nhomloaiKH;
        this.dshdthuephong_khach = dshdthuephong_khach;
    }
}
