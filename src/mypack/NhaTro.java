package mypack;

import java.util.ArrayList;
import java.util.List;

public class NhaTro 
{
	 // khoa chinh manhatro
    public String manhatro; 
    public String tennhatro; 
    public String khuvuc;
    // Danh sach phong tro duoc sap xep theo tung loai nha tro
    public List<PhongTro> dsphongtro_nhatro; 
    // constructor
    public NhaTro() { }
    public NhaTro(NhaTro nhaTro)
    {
        this.manhatro = nhaTro.manhatro;
        this.tennhatro = nhaTro.tennhatro;
        this.khuvuc = nhaTro.khuvuc;
        this.dsphongtro_nhatro = nhaTro.dsphongtro_nhatro;
    }
    public NhaTro(String manhatro, String tennhatro, String khuvuc, ArrayList<PhongTro> dsphongtro_nhatro)
    {
        this.manhatro = manhatro;
        this.tennhatro = tennhatro;
        this.khuvuc = khuvuc;
        this.dsphongtro_nhatro = dsphongtro_nhatro;
    }
    // mã nhà trọ
    public String getManhatro() 
	{
		return manhatro;
	}

	public void setManhatro(String manhatro) 
	{
		this.manhatro = manhatro;
	}
	// tên nhà trọ
	public String getTennhatro() 
	{
		return tennhatro;
	}

	public void setTennhatro(String tennhatro) 
	{
		this.tennhatro = tennhatro;
	}
	// khu vực
	public String getKhuvuc() 
	{
		return khuvuc;
	}

	public void setKhuvuc(String khuvuc) 
	{
		this.khuvuc = khuvuc;
	}
	//list phòng trọ
	public List<PhongTro> getdsphongtro_nhatro() 
	{
		return dsphongtro_nhatro;
	}

	public void setdsphongtro_nhatro(List<PhongTro> dsphongtro_nhatro) 
	{
		this.dsphongtro_nhatro = dsphongtro_nhatro;
	}
}
