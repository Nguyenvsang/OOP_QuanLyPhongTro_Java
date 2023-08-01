package mypack;

import java.util.ArrayList;
import java.util.List;

public class LoaiPhong 
{
	 // khoa chinh maloaiphong
    public String maloaiphong;
    public String tenloaiphong;
    public int dientichphong;// đơn vị mét vuông
    // Danh sach phong duoc xep theo tung loai phong
    public List<PhongTro> dsphongtro_loai;
    // constructor
    public LoaiPhong() { }
    public LoaiPhong(LoaiPhong loaiPhong)
    {
        this.maloaiphong = loaiPhong.maloaiphong;
        this.tenloaiphong = loaiPhong.tenloaiphong;
        this.dientichphong = loaiPhong.dientichphong;
        this.dsphongtro_loai = loaiPhong.dsphongtro_loai;
    }
    public LoaiPhong(String maloaiphong, String tenloaiphong, int dientichphong, ArrayList<PhongTro> dsphongtro_loai)
    {
        this.maloaiphong = maloaiphong;
        this.tenloaiphong = tenloaiphong;
        this.dientichphong = dientichphong;
        this.dsphongtro_loai = dsphongtro_loai;
    }
    // mã loại phòng
    public String getMaloaiphong() 
   	{
   		return maloaiphong;
   	}

   	public void setMaloaiphong(String maloaiphong) 
   	{
   		this.maloaiphong = maloaiphong;
   	}
   	// tên loại phòng
   	public String getTenloaiphong() 
   	{
   		return tenloaiphong;
   	}

   	public void setTenloaiphong(String tenloaiphong) 
   	{
   		this.tenloaiphong = tenloaiphong;
   	}
   	// diện tích phòng
   	public int getDientich() 
	{
		return dientichphong;
	}

	public void setDientch(int dientichphong) 
	{
		this.dientichphong = dientichphong;
	}
	//
	public  List<PhongTro> getdsphongtro_loai() 
	{
		return dsphongtro_loai;
	}

	public void setdsphongtro_loai(List<PhongTro> dsphongtro_loai) 
	{
		this.dsphongtro_loai = dsphongtro_loai;
	}
}
