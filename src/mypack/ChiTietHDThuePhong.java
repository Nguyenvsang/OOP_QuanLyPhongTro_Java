package mypack;

import java.util.List;
import java.util.GregorianCalendar;

public class ChiTietHDThuePhong {
	// khoa chinh maphong, ngaygio, soHDThue
    public String maphong;
    public GregorianCalendar ngaygiodangki;
    public String soHDThue;
    public String tiendatcoc;
    public GregorianCalendar ngaydonvao;
    public GregorianCalendar ngaydonra;
    //
    public HopDongThuePhong hopDong;
    public ChiTietSuDungDichVu chitietsddv;
    // Danh sach phong tro theo chi tiet hop dong
    public List<PhongTro> dsPhongTro_cthd;
    // Các getter setter
    public String getMaphong() {
		return this.maphong;
	}
    public void setMaphong(String maphong) {
		this.maphong=maphong;
	}
    
    public GregorianCalendar getNgaygiodangki() {
		return this.ngaygiodangki;
	}
    public void setNgaygiodangki(GregorianCalendar ngaygiodangki) {
		this.ngaygiodangki=ngaygiodangki;
	}
    
    public String getSoHDThue() {
		return this.soHDThue;
	}
    public void setSoHDThue(String soHDThue) {
		this.soHDThue=soHDThue;
	}
    
    public String getTiendatcoc() {
		return this.tiendatcoc;
	}
    public void setTiendatcoc(String tiendatcoc) {
		this.tiendatcoc=tiendatcoc;
	}
    
    public GregorianCalendar getNgaydonvao() {
		return this.ngaydonvao;
	}
    public void setNgaydonvao(GregorianCalendar ngaydonvao) {
		this.ngaydonvao=ngaydonvao;
	}
    
    public GregorianCalendar getNgaydonra() {
		return this.ngaydonra;
	}
    public void setNgaydonra(GregorianCalendar ngaydonra) {
		this.ngaydonra=ngaydonra;
	}
    
    public HopDongThuePhong getHopDong() {
		return this.hopDong;
	}
    public void setHopDong(HopDongThuePhong hopDong) {
		this.hopDong=hopDong;
	}
    
    public ChiTietSuDungDichVu getChitietsddv() {
		return this.chitietsddv;
	}
    public void setChitietsddv(ChiTietSuDungDichVu chitietsddv) {
		this.chitietsddv=chitietsddv;
	}
    
    public List<PhongTro> getDsPhongTro_cthd() {
		return this.dsPhongTro_cthd;
	}
    public void setDsPhongTro_cthd(List<PhongTro> dsPhongTro_cthd) {
		this.dsPhongTro_cthd=dsPhongTro_cthd;
	}
    // constructor
    public ChiTietHDThuePhong() { }
    public ChiTietHDThuePhong(ChiTietHDThuePhong ct)
    {
        this.maphong = ct.maphong;
        this.ngaygiodangki = ct.ngaygiodangki;
        this.soHDThue = ct.soHDThue;
        this.tiendatcoc = ct.tiendatcoc;
        this.ngaydonvao = ct.ngaydonvao;
        this.ngaydonra = ct.ngaydonra;
        this.hopDong = ct.hopDong;
        this.chitietsddv = ct.chitietsddv;
        this.dsPhongTro_cthd = ct.dsPhongTro_cthd;
    }
    public ChiTietHDThuePhong(String maphong, GregorianCalendar ngaygiodangki, String soHDThue, String tiendatcoc, GregorianCalendar ngaydonvao, GregorianCalendar ngaydonra, HopDongThuePhong hopDong,
        ChiTietSuDungDichVu chitietsddv, List<PhongTro> dsPhongTro_cthd)
    {
        this.maphong = maphong;
        this.ngaygiodangki = ngaygiodangki;
        this.soHDThue = soHDThue;
        this.tiendatcoc = tiendatcoc;
        this.ngaydonvao = ngaydonvao;
        this.ngaydonra = ngaydonra;
        this.hopDong = hopDong;
        this.chitietsddv = chitietsddv;
        this.dsPhongTro_cthd = dsPhongTro_cthd;
    }
}
