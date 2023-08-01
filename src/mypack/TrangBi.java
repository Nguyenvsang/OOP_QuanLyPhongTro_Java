package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;

public class TrangBi 
{
	 //Automatic properties
    public String maPhongTro;//foreign key
    //public string maThietBi;//foreign key
    public GregorianCalendar ngayGio;// thời điểm trang bị

    //Constructor
    public TrangBi() { }

    public TrangBi(TrangBi tBi)
    {
        this.maPhongTro = tBi.maPhongTro;
        //this.maThietBi = tBi.maThietBi;
        this.ngayGio = tBi.ngayGio;
        this.dsThietBi_TB = tBi.dsThietBi_TB;
        this.PTro = tBi.PTro;
    }

    public TrangBi(String maPhongTro, GregorianCalendar nGio, ArrayList<ThietBi> dsTBi, PhongTro PTr)
    {
        this.maPhongTro = maPhongTro;
        //this.maThietBi = maThietBi;
        this.ngayGio = nGio;
        this.dsThietBi_TB = dsTBi;
        this.PTro = PTr;
    }

    //Related
    public List<ThietBi> dsThietBi_TB;//plural >> danh sách thiết bị được trang bị
    public PhongTro PTro;//singular >> phòng trọ được trang bị
    
    //mã phòng trọ
    public String getMaphongtro() 
   	{
   		return maPhongTro;
   	}

   	public void setMaphongtro(String maPhongTro) 
   	{
   		this.maPhongTro = maPhongTro;
   	}
    //ngày giờ
    public GregorianCalendar getNgayGio() 
    {
		return this.ngayGio;
	}
    public void setNgayGio(GregorianCalendar ngayGio) 
    {
		this.ngayGio=ngayGio;
	}
    //Thiết bị
    public  List<ThietBi> getdsThietBi_TB() 
	{
		return dsThietBi_TB;
	}

	public void setdsThietBi_TB(List<ThietBi> dsThietBi_TB) 
	{
		this.dsThietBi_TB = dsThietBi_TB;
	}
	// phòng trọ
	public PhongTro getPTro() 
	{
		return PTro;
	}

	public void setPTro(PhongTro PTro) 
	{
		this.PTro = PTro;
	}
}
