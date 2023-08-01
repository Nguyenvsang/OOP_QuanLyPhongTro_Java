package mypack;

public class ThietBi 
{
	//Automatic properties
    public String maThietBi;//primary key
    public String maLoaiThietBi;//foreign key
    public String tenThietBi;
    public long giaThietBi;
    public int soLuong;
    public int thoiGianBaoHanh;//thời hạn bảo hàng theo tháng

    //Related=singular
    public LoaiThietBi LoaiTB;
    public TrangBi TrangB;
    
    //Constructor
    public ThietBi() { }

    public ThietBi(ThietBi tB)
    {
        this.maThietBi = tB.maThietBi;
        this.maLoaiThietBi = tB.maLoaiThietBi;
        this.tenThietBi = tB.tenThietBi;
        this.giaThietBi = tB.giaThietBi;
        this.soLuong = tB.soLuong;
        this.thoiGianBaoHanh = tB.thoiGianBaoHanh;
        this.LoaiTB = tB.LoaiTB;
        this.TrangB = tB.TrangB;
    }

    public ThietBi(String maThietBi, String maLoaiThietBi, String tenThietBi, long giaThietBi, 
    		int soLuong, int thoiGianBaoHanh, LoaiThietBi LTB, TrangBi TrBi)
    {
        this.maThietBi = maThietBi;
        this.maLoaiThietBi = maLoaiThietBi;
        this.tenThietBi = tenThietBi;
        this.giaThietBi = giaThietBi;
        this.soLuong = soLuong;
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.LoaiTB = LTB;
        this.TrangB = TrBi;
    }

    //Getter - Setter
	public String getMaThietBi() 
	{
		return maThietBi;
	}

	public void setMaThietBi(String maThietBi) 
	{
		this.maThietBi = maThietBi;
	}

	public String getMaLoaiThietBi() 
	{
		return maLoaiThietBi;
	}

	public void setMaLoaiThietBi(String maLoaiThietBi) 
	{
		this.maLoaiThietBi = maLoaiThietBi;
	}

	public String getTenThietBi() 
	{
		return tenThietBi;
	}

	public void setTenThietBi(String tenThietBi) 
	{
		this.tenThietBi = tenThietBi;
	}

	public long getGiaThietBi() 
	{
		return giaThietBi;
	}

	public void setGiaThietBi(long giaThietBi) 
	{
		this.giaThietBi = giaThietBi;
	}

	public int getSoLuong() 
	{
		return soLuong;
	}

	public void setSoLuong(int soLuong) 
	{
		this.soLuong = soLuong;
	}

	public int getThoiGianBaoHanh() 
	{
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) 
	{
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public LoaiThietBi getLoaiTB() 
	{
		return LoaiTB;
	}

	public void setLoaiTB(LoaiThietBi loaiTB) 
	{
		LoaiTB = loaiTB;
	}

	public TrangBi getTrangB() 
	{
		return TrangB;
	}

	public void setTrangB(TrangBi trangB) 
	{
		TrangB = trangB;
	}
}
