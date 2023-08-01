package mypack;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class ChiTietSuDungDichVu 
{
	//Automatic properties
    public String maPhong;//foreign key
    public GregorianCalendar ngayGioDangKi;

    //Related=plural
    public List<DichVu> dsDichVu_ChiTiet;
    //Related=singular
    public ChiTietHDThuePhong CTHDThuePhong;
    
    //Constructor
    public ChiTietSuDungDichVu() { }

    public ChiTietSuDungDichVu(ChiTietSuDungDichVu CTSDDV)
    {
        this.maPhong = CTSDDV.maPhong;
        this.ngayGioDangKi = CTSDDV.ngayGioDangKi;
        this.dsDichVu_ChiTiet = CTSDDV.dsDichVu_ChiTiet;
        this.CTHDThuePhong = CTSDDV.CTHDThuePhong;
    }

    public ChiTietSuDungDichVu(String maPhong, GregorianCalendar ngayGioDangKi, ArrayList<DichVu> dsDichVu, ChiTietHDThuePhong CTHDTP)
    {
        this.maPhong = maPhong;
        this.ngayGioDangKi = ngayGioDangKi;
        this.dsDichVu_ChiTiet = dsDichVu;
        this.CTHDThuePhong = CTHDTP;
    }

    //Getter - Setter
	public String getMaPhong() 
	{
		return maPhong;
	}

	public void setMaPhong(String maPhong) 
	{
		this.maPhong = maPhong;
	}

	public GregorianCalendar getNgayGioDangKi() 
	{
		return ngayGioDangKi;
	}

	public void setNgayGioDangKi(GregorianCalendar ngayGioDangKi) 
	{
		this.ngayGioDangKi = ngayGioDangKi;
	}

	public List<DichVu> getDsDichVu_ChiTiet() 
	{
		return dsDichVu_ChiTiet;
	}

	public void setDsDichVu_ChiTiet(List<DichVu> dsDichVu_ChiTiet) 
	{
		this.dsDichVu_ChiTiet = dsDichVu_ChiTiet;
	}

	public ChiTietHDThuePhong getCTHDThuePhong() 
	{
		return CTHDThuePhong;
	}

	public void setCTHDThuePhong(ChiTietHDThuePhong cTHDThuePhong) 
	{
		CTHDThuePhong = cTHDThuePhong;
	}
}
