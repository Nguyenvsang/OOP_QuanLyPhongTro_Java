package mypack;

import java.util.ArrayList;
import java.util.List;

public class LoaiDichVu 
{
	//Automatic properties
    public String maLoaiDichVu; //primary key
    public String tenLoaiDichVu;

    //Related=plural
    public List<DichVu> dsDichVu_Loai;//danh sách dịch vụ theo loại

    //Constructor
    public LoaiDichVu() { }

    public LoaiDichVu(LoaiDichVu loaiDV)
    {
        this.maLoaiDichVu = loaiDV.maLoaiDichVu;
        this.tenLoaiDichVu = loaiDV.tenLoaiDichVu;
        this.dsDichVu_Loai = loaiDV.dsDichVu_Loai;
    }
  
    //Getter - Setter
    public LoaiDichVu(String maLoaiDichVu, String tenLoaiDichVu, ArrayList<DichVu> dsDV)
    {
        this.maLoaiDichVu = maLoaiDichVu;
        this.tenLoaiDichVu = tenLoaiDichVu;
        this.dsDichVu_Loai = dsDV;
    }

	public String getMaLoaiDichVu() 
	{
		return maLoaiDichVu;
	}

	public void setMaLoaiDichVu(String maLoaiDichVu) 
	{
		this.maLoaiDichVu = maLoaiDichVu;
	}

	public String getTenLoaiDichVu() 
	{
		return tenLoaiDichVu;
	}

	public void setTenLoaiDichVu(String tenLoaiDichVu) 
	{
		this.tenLoaiDichVu = tenLoaiDichVu;
	}

	public List<DichVu> getDsDichVu_Loai() 
	{
		return dsDichVu_Loai;
	}

	public void setDsDichVu_Loai(List<DichVu> dsDichVu_Loai) 
	{
		this.dsDichVu_Loai = dsDichVu_Loai;
	}
}
