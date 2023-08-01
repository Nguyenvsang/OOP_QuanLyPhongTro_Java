package mypack;

import java.util.ArrayList;
import java.util.List;

public class DichVu 
{
	//Automatic properties
    public String maDichVu;//primary key
    public String maLoaiDichVu;//foreign key
    public String tenDichVu;
    public String chiTietDichVu;
    public long giaDichVu;

    //Related=singular
    public LoaiDichVu LoaiDV;
    //Related=plural
    public List<ChiTietSuDungDichVu> dsChiTietSDDichVu_DV;
    
    //Constructor
    public DichVu() { }

    public DichVu(DichVu dv)
    {
        this.maDichVu = dv.maDichVu;
        this.maLoaiDichVu = dv.maLoaiDichVu;
        this.tenDichVu = dv.tenDichVu;
        this.chiTietDichVu = dv.chiTietDichVu;
        this.giaDichVu = dv.giaDichVu;
        this.LoaiDV = dv.LoaiDV;
        this.dsChiTietSDDichVu_DV = dv.dsChiTietSDDichVu_DV;
    }

    public DichVu(String maDichVu, String maLoaiDichVu, String tenDichVu, 
    		String chiTietDichVu, long giaDichVu, LoaiDichVu LDV, ArrayList<ChiTietSuDungDichVu> dsCTSDDV)
    {
        this.maDichVu = maDichVu;
        this.maLoaiDichVu = maLoaiDichVu;
        this.tenDichVu = tenDichVu;
        this.chiTietDichVu = chiTietDichVu;
        this.giaDichVu = giaDichVu;
        this.LoaiDV = LDV;
        this.dsChiTietSDDichVu_DV = dsCTSDDV;
    }

    //Getter - Setter
	public String getMaDichVu() 
	{
		return maDichVu;
	}

	public void setMaDichVu(String maDichVu) 
	{
		this.maDichVu = maDichVu;
	}

	public String getMaLoaiDichVu() 
	{
		return maLoaiDichVu;
	}

	public void setMaLoaiDichVu(String maLoaiDichVu) 
	{
		this.maLoaiDichVu = maLoaiDichVu;
	}

	public String getTenDichVu() 
	{
		return tenDichVu;
	}

	public void setTenDichVu(String tenDichVu) 
	{
		this.tenDichVu = tenDichVu;
	}

	public String getChiTietDichVu() 
	{
		return chiTietDichVu;
	}

	public void setChiTietDichVu(String chiTietDichVu) 
	{
		this.chiTietDichVu = chiTietDichVu;
	}

	public long getGiaDichVu() 
	{
		return giaDichVu;
	}

	public void setGiaDichVu(long giaDichVu) 
	{
		this.giaDichVu = giaDichVu;
	}

	public LoaiDichVu getLoaiDV() 
	{
		return LoaiDV;
	}

	public void setLoaiDV(LoaiDichVu loaiDV) 
	{
		LoaiDV = loaiDV;
	}

	public List<ChiTietSuDungDichVu> getDsChiTietSDDichVu_DV() 
	{
		return dsChiTietSDDichVu_DV;
	}

	public void setDsChiTietSDDichVu_DV(List<ChiTietSuDungDichVu> dsChiTietSDDichVu_DV) 
	{
		this.dsChiTietSDDichVu_DV = dsChiTietSDDichVu_DV;
	}
}
