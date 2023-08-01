package mypack;

public class BangGia 
{
	// khoa chinh mabanggia
    public String mabanggia;
    // khoa ngoai maphong
    public String maphong;
    public int gia;
    //
    public PhongTro phongTro;
    // constructor
    public BangGia() { }
    public BangGia(BangGia bangGia)
    {
        this.mabanggia = bangGia.mabanggia;
        this.maphong = bangGia.maphong;
        this.gia = bangGia.gia;
        this.phongTro = bangGia.phongTro;
    }
    public BangGia(String mabanggia, String maphong, int gia, PhongTro phongTro)
    {
        this.mabanggia = mabanggia;
        this.maphong = maphong;
        this.gia = gia;
        this.phongTro = phongTro;
    }
    // mã bảng giá
    public String getMabanggia() 
   	{
   		return mabanggia;
   	}

   	public void setMabanggia(String mabanggia) 
   	{
   		this.mabanggia = mabanggia;
   	}
   	// mã nhà trọ
    public String getMaphong() 
   	{
   		return maphong;
   	}

   	public void setMaphong(String maphong) 
   	{
   		this.maphong = maphong;
   	}
   	// Giá tiền phòng
   	public int getGia() 
	{
		return gia;
	}

	public void setGia(int gia) 
	{
		this.gia = gia;
	}
	// phòng trọ
	public PhongTro getphongTro() 
	{
		return phongTro;
	}

	public void setphongTro(PhongTro phongTro) 
	{
		this.phongTro = phongTro;
	}

}
