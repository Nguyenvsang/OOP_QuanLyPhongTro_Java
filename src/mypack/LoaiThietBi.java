package mypack;

import java.util.ArrayList;
import java.util.List;

public class LoaiThietBi 
{
	//Automatic properties
    public String maLoaiThietBi;//primary key
    public String tenLoaiThietBi;

    //Related=plural
    public List<ThietBi> dsThietBi_Loai;//danh sách thiết bị theo loại
    
    //Constructor
    public LoaiThietBi() { }

    public LoaiThietBi(LoaiThietBi loaiTB)
    {
        this.maLoaiThietBi = loaiTB.maLoaiThietBi;
        this.tenLoaiThietBi = loaiTB.tenLoaiThietBi;
        this.dsThietBi_Loai = loaiTB.dsThietBi_Loai;
    }

    public LoaiThietBi(String maLoaiThietBi, String tenLoaiThietBi, ArrayList<ThietBi> dsTB)
    {
        this.maLoaiThietBi = maLoaiThietBi;
        this.tenLoaiThietBi = tenLoaiThietBi;
        this.dsThietBi_Loai = dsTB;
    }

    //Getter - Setter
	public String getMaLoaiThietBi() 
	{
		return maLoaiThietBi;
	}

	public void setMaLoaiThietBi(String maLoaiThietBi) 
	{
		this.maLoaiThietBi = maLoaiThietBi;
	}

	public String getTenLoaiThietBi() 
	{
		return tenLoaiThietBi;
	}

	public void setTenLoaiThietBi(String tenLoaiThietBi) 
	{
		this.tenLoaiThietBi = tenLoaiThietBi;
	}

	public List<ThietBi> getDsThietBi_Loai() 
	{
		return dsThietBi_Loai;
	}

	public void setDsThietBi_Loai(List<ThietBi> dsThietBi_Loai) 
	{
		this.dsThietBi_Loai = dsThietBi_Loai;
	}
}
