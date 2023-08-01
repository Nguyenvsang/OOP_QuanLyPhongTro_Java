package mypack;

import java.util.ArrayList;
import java.util.List;

public class PhongTro 
{
	// khoa chinh maphong
    public String maphong;
    // khoa ngoai maloaiphong, manhatro
    public String maloaiphong;
    public String manhatro; 
    public String tenphong;
    public String day;
    // 
    public LoaiPhong loaiPhong;
    public NhaTro nhaTro;
    public TrangBi trangBi; 
    public ChiTietHDThuePhong chitiethd; 
    // Danh sach bang gia xep theo phong tro
    public List<BangGia> dsbanggia_phongtro; 
    // constructor
    public PhongTro() { }
    public PhongTro(PhongTro phongTro)
    {
        this.maphong = phongTro.maphong;
        this.maloaiphong = phongTro.maloaiphong;
        this.manhatro = phongTro.manhatro;
        this.tenphong = phongTro.tenphong;
        this.day = phongTro.day;
        this.loaiPhong = phongTro.loaiPhong;
        this.nhaTro = phongTro.nhaTro;
        this.trangBi = phongTro.trangBi;
        this.chitiethd = phongTro.chitiethd;
        this.dsbanggia_phongtro = phongTro.dsbanggia_phongtro;
     }
    
    public PhongTro(String maphong, String maloaiphong, String manhatro, String tenphong, 
        String day, LoaiPhong loaiPhong, NhaTro nhaTro, TrangBi trangBi, ChiTietHDThuePhong chitiethd, ArrayList<BangGia> dsbanggia_phongtro)
    {
        this.maphong = maphong;
        this.maloaiphong = maloaiphong;
        this.manhatro = manhatro;
        this.tenphong = tenphong;
        this.day = day;
        this.loaiPhong = loaiPhong;
        this.nhaTro = nhaTro;
        this.trangBi = trangBi;
        this.chitiethd = chitiethd;
        this.dsbanggia_phongtro = dsbanggia_phongtro;
    }
    // mã phòng
    public String getMaphong() 
	{
		return maphong;
	}

	public void setmaphong(String maphong) 
	{
		this.maphong = maphong;
	}
	// mã loại phòng
	public String getMaloaiphong() 
	{
		return maloaiphong;
	}

	public void setmaloaiphong(String maloaiphong) 
	{
		this.maloaiphong = maloaiphong;
	}
	// mã nhà trọ
	public String getManhatro() 
	{
		return manhatro;
	}

	public void setmanhatro(String manhatro) 
	{
		this.manhatro = manhatro;
	}
	// tên phòng
	public String getTenphong() 
	{
		return tenphong;
	}

	public void settenphong(String tenphong) 
	{
		this.tenphong = tenphong;
	}
	// dãy trọ
	public String getDay() 
	{
		return day;
	}

	public void setday(String day) 
	{
		this.day = day;
	}
	// loai phòng
	public LoaiPhong getloaiPhong() 
	{
		return loaiPhong;
	}

	public void setloaiPhong(LoaiPhong loaiPhong) 
	{
		this.loaiPhong = loaiPhong;
	}
	// nhà trọ
	public NhaTro getnhaTro() 
	{
		return nhaTro;
	}

	public void setnhaTro(NhaTro nhaTro) 
	{
		this.nhaTro = nhaTro;
	}
	//trang bị
	public TrangBi gettrangBi() 
	{
		return trangBi;
	}

	public void settrangBi(TrangBi trangBi) 
	{
		this.trangBi = trangBi;
	}
	// chi tiết hướng dẫn thuê phòng
	public ChiTietHDThuePhong getchitiethd() 
	{
		return chitiethd;
	}

	public void setchitiethd(ChiTietHDThuePhong chitiethd) 
	{
		this.chitiethd = chitiethd;
	}
	// Bảng giá
	public List<BangGia> getdsbanggia_phongtro() 
	{
		return dsbanggia_phongtro;
	}

	public void setdsbanggia_phongtro(ArrayList<BangGia> dsbanggia_phongtro) 
	{
		this.dsbanggia_phongtro = dsbanggia_phongtro;
	}
}


