package mypack;

import java.util.List;

public class LoaiKH {
	// khoa chinh maloaiKH
	public String maloaiKH;
	public String tenloaiKH;
	// danh sach khach xep theo nhom loai KH
	public List<Khach> dskhach_loai;
	// getter setter
	public String getMaloaiKH() {return this.maloaiKH;}
	public void setMaloaiKH(String maloaiKH) {this.maloaiKH=maloaiKH;}
	
	public String getTenloaiKH() {return this.tenloaiKH;}
	public void setTenloaiKH(String tenloaiKH) {this.tenloaiKH=tenloaiKH;}
	
	public  List<Khach> getDskhach_loai() {return this.dskhach_loai;}
	public void setDskhach_loai(List<Khach> dskhach_loai) {
		this.dskhach_loai= dskhach_loai;
	}	
	// constructor
	public LoaiKH() { }
	public LoaiKH(LoaiKH loaiKH)
	{
		this.maloaiKH = loaiKH.maloaiKH;
		this.tenloaiKH = loaiKH.tenloaiKH;
		this.dskhach_loai = loaiKH.dskhach_loai;
	}
	public LoaiKH(String maloaiKH,String tenloaiKH, List<Khach> dskhach_loai)
	{
		this.maloaiKH = maloaiKH;
		this.tenloaiKH = tenloaiKH;
		this.dskhach_loai = dskhach_loai;
	}
}
