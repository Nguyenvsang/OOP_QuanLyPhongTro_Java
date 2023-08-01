package mypack;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainProgram 
{
	public static List<LoaiKH> dsLoaiKH = new ArrayList<LoaiKH>();
    public static List<Khach> dsKhach = new ArrayList<Khach>();
    public static List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    public static List<HopDongThuePhong> dsHopDongThuePhong = new ArrayList<HopDongThuePhong>();
    public static List<ChiTietHDThuePhong> dsChiTietHDThuePhong = new ArrayList<ChiTietHDThuePhong>();
    
	public static List<LoaiThietBi> dsLoaiThietBi = new ArrayList<LoaiThietBi>();
	public static List<ThietBi> dsThietBi = new ArrayList<ThietBi>();
	public static List<LoaiDichVu> dsLoaiDichVu = new ArrayList<LoaiDichVu>();
	public static List<DichVu> dsDichVu = new ArrayList<DichVu>();
	public static List<ChiTietSuDungDichVu> dsChiTietSuDungDichVu = new ArrayList<ChiTietSuDungDichVu>();

	public static List<PhongTro> ds_Phong_Tro = new ArrayList<PhongTro>();
	public static List<NhaTro> ds_Nha_Tro = new ArrayList<NhaTro>();
	public static List<LoaiPhong> ds_Loai_Phong = new ArrayList<LoaiPhong>();
	public static List<BangGia> ds_Bang_Gia = new ArrayList<BangGia>();
	public static List<TrangBi> dsTrangBi = new ArrayList<TrangBi>();

	public static void TaodanhsachLoaiKH()
    {
        dsLoaiKH.add(new LoaiKH("LKH001", "Bình dân",new ArrayList<Khach>()));
        dsLoaiKH.add(new LoaiKH("LKH002", "Sinh viên", new ArrayList<Khach>()));
        dsLoaiKH.add(new LoaiKH("LKH003", "Cao cấp", new ArrayList<Khach>()));
    }
    
    public static void TaodanhsachKhach()
    {
        dsKhach.add(new Khach("K001", dsLoaiKH.get(0).maloaiKH, "Nguyễn Thị Cúc", "Nữ", new GregorianCalendar(1995, 10, 01),
            "087674859007", "Đồng Tháp", "Thợ May", dsLoaiKH.get(0), new ArrayList<HopDongThuePhong>()));
        dsKhach.add(new Khach("K002", dsLoaiKH.get(0).maloaiKH, "Trần Thị Trang", "Nữ", new GregorianCalendar(1990, 06, 01),
            "074674839007", "Bình Dương", "Công Nhân", dsLoaiKH.get(0), new ArrayList<HopDongThuePhong>()));
        dsKhach.add(new Khach("K003", dsLoaiKH.get(0).maloaiKH, "Nguyễn Công Tài", "Nam", new GregorianCalendar(1989, 02, 19),
            "074673744007", "Bình Dương", "Sửa xe", dsLoaiKH.get(0), new ArrayList<HopDongThuePhong>()));
        dsKhach.add(new Khach("K004", dsLoaiKH.get(1).maloaiKH, "Phạm Tú Uyên", "Nữ", new GregorianCalendar(2001, 04, 16),
            "089123454007", "An Giang", "Sinh Viên", dsLoaiKH.get(1), new ArrayList<HopDongThuePhong>()));
        dsKhach.add(new Khach("K005", dsLoaiKH.get(1).maloaiKH, "Phạm Trần Sơn", "Nam", new GregorianCalendar(2001, 05, 18),
            "095543214007", "Bạc Liêu", "Sinh Viên", dsLoaiKH.get(1), new ArrayList<HopDongThuePhong>()));
        dsKhach.add(new Khach("K006", dsLoaiKH.get(1).maloaiKH, "Lý Thuận Tuấn", "Nam", new GregorianCalendar(2001, 05, 06),
            "083547894007", "Bến Tre", "Sinh Viên", dsLoaiKH.get(1), new ArrayList<HopDongThuePhong>()));
        dsKhach.add(new Khach("K007", dsLoaiKH.get(1).maloaiKH, "Đỗ Thiên Toàn", "Nam", new GregorianCalendar(2001, 8, 03),
            "096645894007", "Cà Mau", "Sinh Viên", dsLoaiKH.get(1), new ArrayList<HopDongThuePhong>()));
        dsKhach.add(new Khach("K008", dsLoaiKH.get(2).maloaiKH, "Lê Thị Ngọc Quỳnh", "Nữ", new GregorianCalendar(1990, 05, 22),
            "096654394007", "Cà Mau", "Nhân viên kinh doanh", dsLoaiKH.get(2), new ArrayList<HopDongThuePhong>()));
        dsKhach.add(new Khach("K009", dsLoaiKH.get(2).maloaiKH, "Phạm Văn Long", "Nam", new GregorianCalendar(1980, 11, 11),
            "075660984007", "Đồng Nai", "Trưởng phòng marketing", dsLoaiKH.get(2), new ArrayList<HopDongThuePhong>()));
        dsKhach.add(new Khach("K010", dsLoaiKH.get(2).maloaiKH, "Lê Hoàng Kim", "Nữ", new GregorianCalendar(1985, 11, 15),
            "075373774007", "Đồng Nai", "Luật sư", dsLoaiKH.get(2), new ArrayList<HopDongThuePhong>()));

        // Xác định các khách trong từng nhóm loại khách hàng
        dsLoaiKH.get(0).dskhach_loai.add(dsKhach.get(0));
        dsLoaiKH.get(0).dskhach_loai.add(dsKhach.get(1));
        dsLoaiKH.get(0).dskhach_loai.add(dsKhach.get(2));

        dsLoaiKH.get(1).dskhach_loai.add(dsKhach.get(3));
        dsLoaiKH.get(1).dskhach_loai.add(dsKhach.get(4));
        dsLoaiKH.get(1).dskhach_loai.add(dsKhach.get(5));
        dsLoaiKH.get(1).dskhach_loai.add(dsKhach.get(6));

        dsLoaiKH.get(2).dskhach_loai.add(dsKhach.get(7));
        dsLoaiKH.get(2).dskhach_loai.add(dsKhach.get(8));
        dsLoaiKH.get(2).dskhach_loai.add(dsKhach.get(9));
    }
    
    public static void TaodanhsachNhanVien()
    {
        dsNhanVien.add(new NhanVien("NV001", "Nguyễn Bích Liên", "Nữ", new GregorianCalendar(1990,8,24), 
            "075673421597", "Đồng Nai", new ArrayList<HopDongThuePhong>()));
        dsNhanVien.add(new NhanVien("NV002", "Trần Hạnh Ngân", "Nữ", new GregorianCalendar(1993,8,04),
            "096674321597", "Cà Mau", new ArrayList<HopDongThuePhong>()));
        dsNhanVien.add(new NhanVien("NV003", "Nguyễn Thùy Linh", "Nữ", new GregorianCalendar(1989,0,06),
            "083673241597", "Bến Tre", new ArrayList<HopDongThuePhong>()));
        dsNhanVien.add(new NhanVien("NV004", "Trần Quốc Tuấn", "Nam", new GregorianCalendar(1985,05,07),
            "087674321597", "Đồng Tháp", new ArrayList<HopDongThuePhong>()));
    }
    
    public static void TaodanhsachHopDongThuePhong()
    {
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT001", dsKhach.get(0).maKH, dsNhanVien.get(0).maNV, dsKhach.get(0), dsNhanVien.get(0), null));
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT002", dsKhach.get(1).maKH, dsNhanVien.get(0).maNV, dsKhach.get(1), dsNhanVien.get(0), null));
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT003", dsKhach.get(2).maKH, dsNhanVien.get(0).maNV, dsKhach.get(2), dsNhanVien.get(0), null));
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT004", dsKhach.get(3).maKH, dsNhanVien.get(1).maNV, dsKhach.get(3), dsNhanVien.get(1), null));
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT005", dsKhach.get(3).maKH, dsNhanVien.get(1).maNV, dsKhach.get(3), dsNhanVien.get(1), null));
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT006", dsKhach.get(5).maKH, dsNhanVien.get(1).maNV, dsKhach.get(5), dsNhanVien.get(1), null));
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT007", dsKhach.get(6).maKH, dsNhanVien.get(2).maNV, dsKhach.get(6), dsNhanVien.get(2), null));
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT008", dsKhach.get(7).maKH, dsNhanVien.get(2).maNV, dsKhach.get(7), dsNhanVien.get(2), null));
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT009", dsKhach.get(8).maKH, dsNhanVien.get(3).maNV, dsKhach.get(8), dsNhanVien.get(3), null));
        dsHopDongThuePhong.add(new HopDongThuePhong("HDT010", dsKhach.get(9).maKH, dsNhanVien.get(3).maNV, dsKhach.get(9), dsNhanVien.get(3), null));

        // Xác định các hợp đồng thuê phòng theo từng khách hàng
        dsKhach.get(0).dshdthuephong_khach.add(dsHopDongThuePhong.get(0));
        dsKhach.get(1).dshdthuephong_khach.add(dsHopDongThuePhong.get(1));
        dsKhach.get(2).dshdthuephong_khach.add(dsHopDongThuePhong.get(2));
        dsKhach.get(3).dshdthuephong_khach.add(dsHopDongThuePhong.get(3));
        dsKhach.get(3).dshdthuephong_khach.add(dsHopDongThuePhong.get(3));
        dsKhach.get(5).dshdthuephong_khach.add(dsHopDongThuePhong.get(5));
        dsKhach.get(6).dshdthuephong_khach.add(dsHopDongThuePhong.get(6));
        dsKhach.get(7).dshdthuephong_khach.add(dsHopDongThuePhong.get(7));
        dsKhach.get(8).dshdthuephong_khach.add(dsHopDongThuePhong.get(8));
        dsKhach.get(9).dshdthuephong_khach.add(dsHopDongThuePhong.get(9));

        // Xác định các hợp đồng thuê phòng theo từng nhân viên
        dsNhanVien.get(0).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(0));
        dsNhanVien.get(0).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(1));
        dsNhanVien.get(0).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(2));

        dsNhanVien.get(1).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(3));
        dsNhanVien.get(1).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(3));
        dsNhanVien.get(1).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(5));

        dsNhanVien.get(2).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(6));
        dsNhanVien.get(2).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(7));

        dsNhanVien.get(3).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(8));
        dsNhanVien.get(3).dsHDTP_nhanvien.add(dsHopDongThuePhong.get(9));
    }
    
    public static void TaoDanhSachChiTietHDThuePhong()
    {
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(0).maphong, new GregorianCalendar(2017, 06, 21, 8, 00, 00), dsHopDongThuePhong.get(0).soHDThue, "1000000", 
        	new GregorianCalendar(2017, 7, 21, 8, 00, 00),
        	new GregorianCalendar(2022, 7, 21, 12, 00, 00), dsHopDongThuePhong.get(0), null, new ArrayList<PhongTro>()));
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(1).maphong, new GregorianCalendar(2018, 04, 21, 8, 00, 00), dsHopDongThuePhong.get(1).soHDThue, "1000000",
        	new GregorianCalendar(2018, 05, 21, 8, 00, 00),
        	new GregorianCalendar(2022, 05, 21, 12, 00, 00), dsHopDongThuePhong.get(1), null, new ArrayList<PhongTro>()));
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(2).maphong, new GregorianCalendar(2018, 06, 12, 8, 00, 00), dsHopDongThuePhong.get(2).soHDThue, "1000000", 
        	new GregorianCalendar(2018, 7, 12, 8, 00, 00),
            new GregorianCalendar(2022, 7, 12, 12, 00, 00), dsHopDongThuePhong.get(2), null, new ArrayList<PhongTro>()));
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(5).maphong, new GregorianCalendar(2019, 04, 29, 8, 00, 00), dsHopDongThuePhong.get(3).soHDThue, "1000000", 
        	new GregorianCalendar(2019, 05, 29, 8, 00, 00),
            new GregorianCalendar(2022, 05, 29, 12, 00, 00), dsHopDongThuePhong.get(3), null, new ArrayList<PhongTro>()));
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(6).maphong, new GregorianCalendar(2019, 05, 19, 8, 00, 00), dsHopDongThuePhong.get(4).soHDThue, "1000000", 
        	new GregorianCalendar(2019, 06, 19, 8, 00, 00),
            new GregorianCalendar(2022, 06, 19, 12, 00, 00), dsHopDongThuePhong.get(4), null, new ArrayList<PhongTro>()));
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(7).maphong, new GregorianCalendar(2019, 10, 9, 8, 00, 00), dsHopDongThuePhong.get(5).soHDThue, "1000000", 
        	new GregorianCalendar(2019, 11, 9, 8, 00, 00),
            new GregorianCalendar(2022, 11, 9, 12, 00, 00), dsHopDongThuePhong.get(5), null, new ArrayList<PhongTro>()));
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(8).maphong, new GregorianCalendar(2020, 04, 11, 8, 00, 00), dsHopDongThuePhong.get(6).soHDThue, "1000000", 
        	new GregorianCalendar(2020, 05, 11, 8, 00, 00),
            new GregorianCalendar(2022, 05, 11, 12, 00, 00), dsHopDongThuePhong.get(6), null, new ArrayList<PhongTro>()));
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(10).maphong, new GregorianCalendar(2020, 11, 15, 8, 00, 00), dsHopDongThuePhong.get(7).soHDThue, "1000000", 
        	new GregorianCalendar(2021, 0, 15, 8, 00, 00),
            new GregorianCalendar(2022, 0, 15, 12, 00, 00), dsHopDongThuePhong.get(7), null, new ArrayList<PhongTro>()));
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(11).maphong, new GregorianCalendar(2021, 04, 12, 8, 00, 00), dsHopDongThuePhong.get(8).soHDThue, "1000000", 
        	new GregorianCalendar(2021, 05, 12, 8, 00, 00),
            new GregorianCalendar(2022, 05, 12, 12, 00, 00), dsHopDongThuePhong.get(8), null, new ArrayList<PhongTro>()));
        dsChiTietHDThuePhong.add(new ChiTietHDThuePhong(ds_Phong_Tro.get(12).maphong, new GregorianCalendar(2021, 7, 27, 8, 00, 00), dsHopDongThuePhong.get(9).soHDThue, "1000000", 
        	new GregorianCalendar(2021, 8, 27, 8, 00, 00),
            new GregorianCalendar(2022, 8, 27, 12, 00, 00), dsHopDongThuePhong.get(9), null, new ArrayList<PhongTro>()));

        //Gán chi tiết hợp đồng theo từng hợp đồng
        dsHopDongThuePhong.get(0).chitiethd = dsChiTietHDThuePhong.get(0);
        dsHopDongThuePhong.get(1).chitiethd = dsChiTietHDThuePhong.get(1);
        dsHopDongThuePhong.get(2).chitiethd = dsChiTietHDThuePhong.get(2);
        dsHopDongThuePhong.get(3).chitiethd = dsChiTietHDThuePhong.get(3);
        dsHopDongThuePhong.get(4).chitiethd = dsChiTietHDThuePhong.get(4);
        dsHopDongThuePhong.get(5).chitiethd = dsChiTietHDThuePhong.get(5);
        dsHopDongThuePhong.get(6).chitiethd = dsChiTietHDThuePhong.get(6);
        dsHopDongThuePhong.get(7).chitiethd = dsChiTietHDThuePhong.get(7);
        dsHopDongThuePhong.get(8).chitiethd = dsChiTietHDThuePhong.get(8);
        dsHopDongThuePhong.get(9).chitiethd = dsChiTietHDThuePhong.get(9);

        //Gán chi tiết hợp đồng theo từng phòng trọ
        ds_Phong_Tro.get(0).chitiethd = dsChiTietHDThuePhong.get(0);
        ds_Phong_Tro.get(1).chitiethd = dsChiTietHDThuePhong.get(1);
        ds_Phong_Tro.get(2).chitiethd = dsChiTietHDThuePhong.get(2);
        ds_Phong_Tro.get(5).chitiethd = dsChiTietHDThuePhong.get(3);
        ds_Phong_Tro.get(6).chitiethd = dsChiTietHDThuePhong.get(4);
        ds_Phong_Tro.get(7).chitiethd = dsChiTietHDThuePhong.get(5);
        ds_Phong_Tro.get(8).chitiethd = dsChiTietHDThuePhong.get(6);
        ds_Phong_Tro.get(10).chitiethd = dsChiTietHDThuePhong.get(7);
        ds_Phong_Tro.get(11).chitiethd = dsChiTietHDThuePhong.get(8);
        ds_Phong_Tro.get(12).chitiethd = dsChiTietHDThuePhong.get(9);

        // Danh sach phong tro theo chi tiet hop dong
        dsChiTietHDThuePhong.get(0).dsPhongTro_cthd.add(ds_Phong_Tro.get(0));//phong tro binh dan
        dsChiTietHDThuePhong.get(1).dsPhongTro_cthd.add(ds_Phong_Tro.get(1));
        dsChiTietHDThuePhong.get(2).dsPhongTro_cthd.add(ds_Phong_Tro.get(2));

        dsChiTietHDThuePhong.get(3).dsPhongTro_cthd.add(ds_Phong_Tro.get(5));//phong tro sinh vien
        dsChiTietHDThuePhong.get(4).dsPhongTro_cthd.add(ds_Phong_Tro.get(6));
        dsChiTietHDThuePhong.get(5).dsPhongTro_cthd.add(ds_Phong_Tro.get(7));
        dsChiTietHDThuePhong.get(6).dsPhongTro_cthd.add(ds_Phong_Tro.get(8));

        dsChiTietHDThuePhong.get(7).dsPhongTro_cthd.add(ds_Phong_Tro.get(10));//phong tro cao cap
        dsChiTietHDThuePhong.get(8).dsPhongTro_cthd.add(ds_Phong_Tro.get(11));
        dsChiTietHDThuePhong.get(9).dsPhongTro_cthd.add(ds_Phong_Tro.get(12));
    }
    
	public static void TaoDanhSachLoaiThietBi()
	{
		dsLoaiThietBi.add(new LoaiThietBi("LTB01", "Thiết bị điện, điện tử", new ArrayList<ThietBi>()));
		dsLoaiThietBi.add(new LoaiThietBi("LTB02", "Thiết bị gia dụng bếp", new ArrayList<ThietBi>()));
		dsLoaiThietBi.add(new LoaiThietBi("LTB03", "Thiết bị nội thất", new ArrayList<ThietBi>()));
	}

	public static void TaoDanhSachThietBi()
	{
		dsThietBi.add(new ThietBi("TB001", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt trần KDX", 1350000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB002", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt trần KDX", 1350000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB003", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt trần KDX", 1350000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB004", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt trần KDX", 1350000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB005", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt trần KDX", 1350000, 1, 12, dsLoaiThietBi.get(0), null));

		dsThietBi.add(new ThietBi("TB006", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt đứng Sharp", 999000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB007", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt đứng Sharp", 999000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB008", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt đứng Sharp", 999000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB009", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt đứng Sharp", 999000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB010", dsLoaiThietBi.get(0).maLoaiThietBi, "Quạt đứng Sharp", 999000, 1, 12, dsLoaiThietBi.get(0), null));

		dsThietBi.add(new ThietBi("TB011", dsLoaiThietBi.get(0).maLoaiThietBi, "Smart TV Samsung", 14190000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB012", dsLoaiThietBi.get(0).maLoaiThietBi, "Smart TV Samsung", 14190000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB013", dsLoaiThietBi.get(0).maLoaiThietBi, "Smart TV Samsung", 14190000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB014", dsLoaiThietBi.get(0).maLoaiThietBi, "Smart TV Samsung", 14190000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB015", dsLoaiThietBi.get(0).maLoaiThietBi, "Smart TV Samsung", 14190000, 1, 24, dsLoaiThietBi.get(0), null));

		dsThietBi.add(new ThietBi("TB016", dsLoaiThietBi.get(0).maLoaiThietBi, "TV LED DARKLING", 3066000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB017", dsLoaiThietBi.get(0).maLoaiThietBi, "TV LED DARKLING", 3066000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB018", dsLoaiThietBi.get(0).maLoaiThietBi, "TV LED DARKLING", 3066000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB019", dsLoaiThietBi.get(0).maLoaiThietBi, "TV LED DARKLING", 3066000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB020", dsLoaiThietBi.get(0).maLoaiThietBi, "TV LED DARKLING", 3066000, 1, 24, dsLoaiThietBi.get(0), null));

		dsThietBi.add(new ThietBi("TB021", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy lạnh AQUA Inverter", 9990000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB022", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy lạnh AQUA Inverter", 9990000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB023", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy lạnh AQUA Inverter", 9990000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB024", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy lạnh AQUA Inverter", 9990000, 1, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB025", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy lạnh AQUA Inverter", 9990000, 1, 12, dsLoaiThietBi.get(0), null));

		dsThietBi.add(new ThietBi("TB026", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 3, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB027", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 3, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB028", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 3, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB029", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 3, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB030", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 3, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB031", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 2, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB032", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 2, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB033", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 2, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB034", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 2, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB035", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 2, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB036", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 4, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB037", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 4, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB038", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 4, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB039", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 4, 12, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB040", dsLoaiThietBi.get(0).maLoaiThietBi, "Đèn huỳnh quang DDROYAL ", 390000, 4, 12, dsLoaiThietBi.get(0), null));

		dsThietBi.add(new ThietBi("TB041", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy giặt AQUA", 3790000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB042", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy giặt AQUA", 3790000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB043", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy giặt AQUA", 3790000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB044", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy giặt AQUA", 3790000, 1, 24, dsLoaiThietBi.get(0), null));
		dsThietBi.add(new ThietBi("TB045", dsLoaiThietBi.get(0).maLoaiThietBi, "Máy giặt AQUA", 3790000, 1, 24, dsLoaiThietBi.get(0), null));

		dsThietBi.add(new ThietBi("TB046", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đôi Sunhouse", 509000, 1, 12, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB047", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đôi Sunhouse", 509000, 1, 12, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB048", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đôi Sunhouse", 509000, 1, 12, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB049", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đôi Sunhouse", 509000, 1, 12, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB050", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đôi Sunhouse", 509000, 1, 12, dsLoaiThietBi.get(1), null));

		dsThietBi.add(new ThietBi("TB051", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đơn Kiwa", 350000, 1, 24, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB052", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đơn Kiwa", 350000, 1, 24, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB053", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đơn Kiwa", 350000, 1, 24, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB054", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đơn Kiwa", 350000, 1, 24, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB055", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp ga đơn Kiwa", 350000, 1, 24, dsLoaiThietBi.get(1), null));

		dsThietBi.add(new ThietBi("TB056", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp hồng ngoại Sunhouse", 3663000, 1, 36, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB057", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp hồng ngoại Sunhouse", 3663000, 1, 36, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB058", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp hồng ngoại Sunhouse", 3663000, 1, 36, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB059", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp hồng ngoại Sunhouse", 3663000, 1, 36, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB060", dsLoaiThietBi.get(1).maLoaiThietBi, "Bếp hồng ngoại Sunhouse", 3663000, 1, 36, dsLoaiThietBi.get(1), null));

		dsThietBi.add(new ThietBi("TB061", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh AQUA 90L", 2990000, 1, 24, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB062", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh AQUA 90L", 2990000, 1, 24, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB063", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh AQUA 90L", 2990000, 1, 24, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB064", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh AQUA 90L", 2990000, 1, 24, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB065", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh AQUA 90L", 2990000, 1, 24, dsLoaiThietBi.get(1), null));

		dsThietBi.add(new ThietBi("TB066", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh Sharp Inverter 150L", 4790000, 1, 12, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB067", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh Sharp Inverter 150L", 4790000, 1, 12, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB068", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh Sharp Inverter 150L", 4790000, 1, 12, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB069", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh Sharp Inverter 150L", 4790000, 1, 12, dsLoaiThietBi.get(1), null));
		dsThietBi.add(new ThietBi("TB070", dsLoaiThietBi.get(1).maLoaiThietBi, "Tủ lạnh Sharp Inverter 150L", 4790000, 1, 12, dsLoaiThietBi.get(1), null));

		dsThietBi.add(new ThietBi("TB071", dsLoaiThietBi.get(2).maLoaiThietBi, "Nệm bông ép", 585000, 2, 60, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB072", dsLoaiThietBi.get(2).maLoaiThietBi, "Nệm bông ép", 585000, 2, 60, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB073", dsLoaiThietBi.get(2).maLoaiThietBi, "Nệm bông ép", 585000, 2, 60, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB074", dsLoaiThietBi.get(2).maLoaiThietBi, "Nệm bông ép", 585000, 2, 60, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB075", dsLoaiThietBi.get(2).maLoaiThietBi, "Nệm bông ép", 585000, 2, 60, dsLoaiThietBi.get(2), null));

		dsThietBi.add(new ThietBi("TB076", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường gỗ", 3470000, 1, 12, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB077", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường gỗ", 3470000, 1, 12, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB078", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường gỗ", 3470000, 1, 12, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB079", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường gỗ", 3470000, 1, 12, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB080", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường gỗ", 3470000, 1, 12, dsLoaiThietBi.get(2), null));

		dsThietBi.add(new ThietBi("TB081", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường sắt đơn", 850000, 1, 12, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB082", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường sắt đơn", 850000, 1, 12, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB083", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường sắt đơn", 850000, 1, 12, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB084", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường sắt đơn", 850000, 1, 12, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB085", dsLoaiThietBi.get(2).maLoaiThietBi, "Giường sắt đơn", 850000, 1, 12, dsLoaiThietBi.get(2), null));

		dsThietBi.add(new ThietBi("TB086", dsLoaiThietBi.get(2).maLoaiThietBi, "Kệ sách gỗ", 699000, 1, 24, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB087", dsLoaiThietBi.get(2).maLoaiThietBi, "Kệ sách gỗ", 699000, 1, 24, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB088", dsLoaiThietBi.get(2).maLoaiThietBi, "Kệ sách gỗ", 699000, 1, 24, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB089", dsLoaiThietBi.get(2).maLoaiThietBi, "Kệ sách gỗ", 699000, 1, 24, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB090", dsLoaiThietBi.get(2).maLoaiThietBi, "Kệ sách gỗ", 699000, 1, 24, dsLoaiThietBi.get(2), null));

		dsThietBi.add(new ThietBi("TB091", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ sắt quần áo", 700000, 1, 0, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB092", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ sắt quần áo", 700000, 1, 0, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB093", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ sắt quần áo", 700000, 1, 0, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB094", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ sắt quần áo", 700000, 1, 0, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB095", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ sắt quần áo", 700000, 1, 0, dsLoaiThietBi.get(2), null));

		dsThietBi.add(new ThietBi("TB096", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ gỗ quần áo", 1700000, 1, 24, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB097", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ gỗ quần áo", 1700000, 1, 24, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB098", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ gỗ quần áo", 1700000, 1, 24, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB099", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ gỗ quần áo", 1700000, 1, 24, dsLoaiThietBi.get(2), null));
		dsThietBi.add(new ThietBi("TB100", dsLoaiThietBi.get(2).maLoaiThietBi, "Tủ gỗ quần áo", 1700000, 1, 24, dsLoaiThietBi.get(2), null));


		//Thêm danh sách thiết bị vào loại thiết bị
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(0));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(1));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(2));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(3));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(4));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(5));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(6));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(7));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(8));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(9));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(10));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(11));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(12));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(13));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(14));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(15));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(16));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(17));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(18));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(19));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(20));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(21));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(22));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(23));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(24));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(25));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(26));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(27));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(28));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(29));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(30));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(31));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(32));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(33));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(34));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(35));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(36));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(37));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(38));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(39));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(40));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(41));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(42));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(43));
		dsLoaiThietBi.get(0).dsThietBi_Loai.add(dsThietBi.get(44));

		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(45));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(46));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(47));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(48));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(49));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(50));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(51));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(52));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(53));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(54));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(55));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(56));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(57));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(58));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(59));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(60));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(61));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(62));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(63));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(64));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(65));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(66));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(67));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(68));
		dsLoaiThietBi.get(1).dsThietBi_Loai.add(dsThietBi.get(69));

		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(70));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(71));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(72));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(73));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(74));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(75));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(76));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(77));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(78));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(79));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(80));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(81));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(82));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(83));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(84));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(85));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(86));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(87));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(88));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(89));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(90));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(91));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(92));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(93));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(94));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(95));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(96));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(97));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(98));
		dsLoaiThietBi.get(2).dsThietBi_Loai.add(dsThietBi.get(99));
	}
	public static void TaoDanhSachLoaiDichVu()
	{
		dsLoaiDichVu.add(new LoaiDichVu("LDV01", "Vệ sinh", new ArrayList<DichVu>()));//tính tổng theo tháng
		dsLoaiDichVu.add(new LoaiDichVu("LDV01", "Bảo trì", new ArrayList<DichVu>()));
	}

	public static void TaoDanhSachDichVu()
	{
		dsDichVu.add(new DichVu("DV01", dsLoaiDichVu.get(0).maLoaiDichVu, "Dọn dẹp", "Mỗi tuần một lần, theo giờ", 30000, dsLoaiDichVu.get(0), new ArrayList<ChiTietSuDungDichVu>()));
		dsDichVu.add(new DichVu("DV02", dsLoaiDichVu.get(0).maLoaiDichVu, "Vứt rác", "Mỗi ngày, theo tháng", 10000, dsLoaiDichVu.get(0), new ArrayList<ChiTietSuDungDichVu>()));
		dsDichVu.add(new DichVu("DV03", dsLoaiDichVu.get(0).maLoaiDichVu, "Giặt quần áo ướt", "Mỗi ngày, trung bình theo kg", 5000, dsLoaiDichVu.get(0), new ArrayList<ChiTietSuDungDichVu>()));
		dsDichVu.add(new DichVu("DV04", dsLoaiDichVu.get(0).maLoaiDichVu, "Giặt quần áo sấy khô", "Mỗi ngày, trung bình theo kg", 12000, dsLoaiDichVu.get(0), new ArrayList<ChiTietSuDungDichVu>()));
		dsDichVu.add(new DichVu("DV05", dsLoaiDichVu.get(0).maLoaiDichVu, "Vệ sinh ống cống", "Mỗi năm", 100000, dsLoaiDichVu.get(0), new ArrayList<ChiTietSuDungDichVu>()));
		dsDichVu.add(new DichVu("DV06", dsLoaiDichVu.get(1).maLoaiDichVu, "Bảo trì thiết bị điện", "Mỗi nửa năm", 200000, dsLoaiDichVu.get(1), new ArrayList<ChiTietSuDungDichVu>()));

		//Thêm danh sách dịch vụ vào loại dịch vụ
		dsLoaiDichVu.get(0).dsDichVu_Loai.add(dsDichVu.get(0));
		dsLoaiDichVu.get(0).dsDichVu_Loai.add(dsDichVu.get(1));
		dsLoaiDichVu.get(0).dsDichVu_Loai.add(dsDichVu.get(2));
		dsLoaiDichVu.get(0).dsDichVu_Loai.add(dsDichVu.get(3));
		dsLoaiDichVu.get(0).dsDichVu_Loai.add(dsDichVu.get(4));

		dsLoaiDichVu.get(1).dsDichVu_Loai.add(dsDichVu.get(5));


	}

	public static void TaoDanhSachChiTietSuDungDichVu()
	{

		dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(0).maphong, new GregorianCalendar(2017, 06, 21, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(0)));
        dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(1).maphong, new GregorianCalendar(2018, 04, 21, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(1)));
        dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(2).maphong, new GregorianCalendar(2018, 06, 12, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(2)));
        dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(5).maphong, new GregorianCalendar(2019, 04, 29, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(3)));
        dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(6).maphong, new GregorianCalendar(2019, 05, 19, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(4)));
        dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(7).maphong, new GregorianCalendar(2019, 10, 9, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(5)));
        dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(8).maphong, new GregorianCalendar(2020, 04, 11, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(6)));
        dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(10).maphong, new GregorianCalendar(2020, 11, 15, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(7)));
        dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(11).maphong, new GregorianCalendar(2021, 04, 01, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(8)));
        dsChiTietSuDungDichVu.add(new ChiTietSuDungDichVu(ds_Phong_Tro.get(12).maphong, new GregorianCalendar(2021, 7, 27, 12, 00, 00), new ArrayList<DichVu>(), dsChiTietHDThuePhong.get(9)));
		
        //Thêm danh sách dịch vụ vào chi tiết sử dụng dịch vụ
		dsChiTietSuDungDichVu.get(0).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(0).dsDichVu_ChiTiet.add(dsDichVu.get(4));
		dsChiTietSuDungDichVu.get(0).dsDichVu_ChiTiet.add(dsDichVu.get(5));

		dsChiTietSuDungDichVu.get(1).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(1).dsDichVu_ChiTiet.add(dsDichVu.get(4));

		dsChiTietSuDungDichVu.get(2).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(2).dsDichVu_ChiTiet.add(dsDichVu.get(4));

		dsChiTietSuDungDichVu.get(3).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(3).dsDichVu_ChiTiet.add(dsDichVu.get(4));

		dsChiTietSuDungDichVu.get(3).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(3).dsDichVu_ChiTiet.add(dsDichVu.get(4));

		dsChiTietSuDungDichVu.get(4).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(4).dsDichVu_ChiTiet.add(dsDichVu.get(4));

		dsChiTietSuDungDichVu.get(5).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(5).dsDichVu_ChiTiet.add(dsDichVu.get(4));

		dsChiTietSuDungDichVu.get(6).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(6).dsDichVu_ChiTiet.add(dsDichVu.get(2));
		dsChiTietSuDungDichVu.get(6).dsDichVu_ChiTiet.add(dsDichVu.get(4));

		dsChiTietSuDungDichVu.get(7).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(7).dsDichVu_ChiTiet.add(dsDichVu.get(4));
		dsChiTietSuDungDichVu.get(7).dsDichVu_ChiTiet.add(dsDichVu.get(5));

		dsChiTietSuDungDichVu.get(8).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(8).dsDichVu_ChiTiet.add(dsDichVu.get(4));

		dsChiTietSuDungDichVu.get(9).dsDichVu_ChiTiet.add(dsDichVu.get(0));
		dsChiTietSuDungDichVu.get(9).dsDichVu_ChiTiet.add(dsDichVu.get(1));
		dsChiTietSuDungDichVu.get(9).dsDichVu_ChiTiet.add(dsDichVu.get(3));
		dsChiTietSuDungDichVu.get(9).dsDichVu_ChiTiet.add(dsDichVu.get(4));
		dsChiTietSuDungDichVu.get(9).dsDichVu_ChiTiet.add(dsDichVu.get(5));

		//Gán danh sách chi tiết sử dụng dịch vụ theo hợp đồng thuê phòng
		dsChiTietHDThuePhong.get(0).chitietsddv = dsChiTietSuDungDichVu.get(0);
		dsChiTietHDThuePhong.get(1).chitietsddv = dsChiTietSuDungDichVu.get(1);
		dsChiTietHDThuePhong.get(2).chitietsddv = dsChiTietSuDungDichVu.get(2);
		dsChiTietHDThuePhong.get(3).chitietsddv = dsChiTietSuDungDichVu.get(3);
		dsChiTietHDThuePhong.get(4).chitietsddv = dsChiTietSuDungDichVu.get(4);
		dsChiTietHDThuePhong.get(5).chitietsddv = dsChiTietSuDungDichVu.get(5);
		dsChiTietHDThuePhong.get(6).chitietsddv = dsChiTietSuDungDichVu.get(6);
		dsChiTietHDThuePhong.get(7).chitietsddv = dsChiTietSuDungDichVu.get(7);
		dsChiTietHDThuePhong.get(8).chitietsddv = dsChiTietSuDungDichVu.get(8);
		dsChiTietHDThuePhong.get(9).chitietsddv = dsChiTietSuDungDichVu.get(9);

		//Thêm danh sách chi tiết sử dụng dịch vụ theo dịch vụ
		dsDichVu.get(0).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(9));

		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(0));
		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(1));
		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(2));
		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(3));
		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(4));
		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(5));
		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(6));
		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(7));
		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(8));
		dsDichVu.get(1).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(9));

		dsDichVu.get(2).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(6));

		dsDichVu.get(3).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(9));

		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(0));
		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(1));
		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(2));
		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(3));
		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(4));
		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(5));
		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(6));
		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(7));
		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(8));
		dsDichVu.get(4).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(9));

		dsDichVu.get(5).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(0));
		dsDichVu.get(5).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(7));
		dsDichVu.get(5).dsChiTietSDDichVu_DV.add(dsChiTietSuDungDichVu.get(9));
	}

	public static void TaoDanhSachNhaTro()
	{
		ds_Nha_Tro.add(new NhaTro("NT01", "Cát Tường", "Quận 6", new ArrayList<PhongTro>()));
		ds_Nha_Tro.add(new NhaTro("NT02", "Mỹ Tâm", "Quận 8", new ArrayList<PhongTro>()));
		ds_Nha_Tro.add(new NhaTro("NT03", "Minh Khôi", "Quận 2", new ArrayList<PhongTro>()));
		ds_Nha_Tro.add(new NhaTro("NT04", "Mai Linh", "Quận Bình Thạnh", new ArrayList<PhongTro>()));
		ds_Nha_Tro.add(new NhaTro("NT05", "Thuận Sang", "Thành phố Thủ Đức", new ArrayList<PhongTro>()));
	}
	//Tạo danh sách loại phòng theo yêu cầu 
	public static void TaoDanhSachLoaiPhong()
	{
		ds_Loai_Phong.add(new LoaiPhong("LP-A", "Trọ bình dân", 20, new ArrayList<PhongTro>()));
		ds_Loai_Phong.add(new LoaiPhong("LP-B", "Trọ sinh viên", 15, new ArrayList<PhongTro>()));
		ds_Loai_Phong.add(new LoaiPhong("LP-C", "Trọ cao cấp", 30, new ArrayList<PhongTro>()));
	}
	public static void TaoDanhSachBangGia()
	{
		ds_Bang_Gia.add(new BangGia("BG-01", ds_Phong_Tro.get(0).maphong, 2500000, ds_Phong_Tro.get(0)));
		ds_Bang_Gia.add(new BangGia("BG-02", ds_Phong_Tro.get(1).maphong, 2500000, ds_Phong_Tro.get(0)));
		ds_Bang_Gia.add(new BangGia("BG-03", ds_Phong_Tro.get(2).maphong, 2500000, ds_Phong_Tro.get(0)));
		ds_Bang_Gia.add(new BangGia("BG-04", ds_Phong_Tro.get(3).maphong, 2500000, ds_Phong_Tro.get(0)));
		ds_Bang_Gia.add(new BangGia("BG-05", ds_Phong_Tro.get(4).maphong, 2500000, ds_Phong_Tro.get(0)));

		ds_Bang_Gia.add(new BangGia("BG-06", ds_Phong_Tro.get(5).maphong, 1500000, ds_Phong_Tro.get(5)));
		ds_Bang_Gia.add(new BangGia("BG-07", ds_Phong_Tro.get(6).maphong, 1500000, ds_Phong_Tro.get(6)));
		ds_Bang_Gia.add(new BangGia("BG-08", ds_Phong_Tro.get(7).maphong, 1500000, ds_Phong_Tro.get(7)));
		ds_Bang_Gia.add(new BangGia("BG-09", ds_Phong_Tro.get(8).maphong, 1500000, ds_Phong_Tro.get(8)));
		ds_Bang_Gia.add(new BangGia("BG-10", ds_Phong_Tro.get(9).maphong, 1500000, ds_Phong_Tro.get(9)));

		ds_Bang_Gia.add(new BangGia("BG-11", ds_Phong_Tro.get(10).maphong, 5500000, ds_Phong_Tro.get(10)));
		ds_Bang_Gia.add(new BangGia("BG-12", ds_Phong_Tro.get(11).maphong, 5500000, ds_Phong_Tro.get(11)));
		ds_Bang_Gia.add(new BangGia("BG-13", ds_Phong_Tro.get(12).maphong, 5500000, ds_Phong_Tro.get(12)));
		ds_Bang_Gia.add(new BangGia("BG-14", ds_Phong_Tro.get(13).maphong, 5500000, ds_Phong_Tro.get(13)));
		ds_Bang_Gia.add(new BangGia("BG-15", ds_Phong_Tro.get(14).maphong, 5500000, ds_Phong_Tro.get(14)));

		// Danh sach bang gia xep theo phong tro
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
		ds_Phong_Tro.get(0).dsbanggia_phongtro.add(ds_Bang_Gia.get(0));
	}

	//Tạo danh sách phòng trọ sẽ được thuê
	public static void TaoDanhSachPhongTro()
	{
		ds_Phong_Tro.add(new PhongTro("S1", ds_Loai_Phong.get(0).maloaiphong, ds_Nha_Tro.get(0).manhatro, "Phòng A1", "A", ds_Loai_Phong.get(0), ds_Nha_Tro.get(0), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("S2", ds_Loai_Phong.get(0).maloaiphong, ds_Nha_Tro.get(1).manhatro, "Phòng A2", "A", ds_Loai_Phong.get(0), ds_Nha_Tro.get(1), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("S3", ds_Loai_Phong.get(0).maloaiphong, ds_Nha_Tro.get(2).manhatro, "Phòng A3", "A", ds_Loai_Phong.get(0), ds_Nha_Tro.get(2), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("S4", ds_Loai_Phong.get(0).maloaiphong, ds_Nha_Tro.get(3).manhatro, "Phòng A4", "A", ds_Loai_Phong.get(0), ds_Nha_Tro.get(3), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("S5", ds_Loai_Phong.get(0).maloaiphong, ds_Nha_Tro.get(4).manhatro, "Phòng A5", "A", ds_Loai_Phong.get(0), ds_Nha_Tro.get(4), null, null, new ArrayList<BangGia>()));

		ds_Phong_Tro.add(new PhongTro("H1", ds_Loai_Phong.get(1).maloaiphong, ds_Nha_Tro.get(0).manhatro, "Phòng B1", "B", ds_Loai_Phong.get(1), ds_Nha_Tro.get(0), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("H2", ds_Loai_Phong.get(1).maloaiphong, ds_Nha_Tro.get(1).manhatro, "Phòng B2", "B", ds_Loai_Phong.get(1), ds_Nha_Tro.get(1), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("H3", ds_Loai_Phong.get(1).maloaiphong, ds_Nha_Tro.get(2).manhatro, "Phòng B3", "B", ds_Loai_Phong.get(1), ds_Nha_Tro.get(2), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("H4", ds_Loai_Phong.get(1).maloaiphong, ds_Nha_Tro.get(3).manhatro, "Phòng B4", "B", ds_Loai_Phong.get(1), ds_Nha_Tro.get(3), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("H5", ds_Loai_Phong.get(1).maloaiphong, ds_Nha_Tro.get(4).manhatro, "Phòng B5", "B", ds_Loai_Phong.get(1), ds_Nha_Tro.get(4), null, null, new ArrayList<BangGia>()));

		ds_Phong_Tro.add(new PhongTro("T1", ds_Loai_Phong.get(2).maloaiphong, ds_Nha_Tro.get(0).manhatro, "Phòng C1", "C", ds_Loai_Phong.get(2), ds_Nha_Tro.get(0), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("T2", ds_Loai_Phong.get(2).maloaiphong, ds_Nha_Tro.get(1).manhatro, "Phòng C2", "C", ds_Loai_Phong.get(2), ds_Nha_Tro.get(1), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("T3", ds_Loai_Phong.get(2).maloaiphong, ds_Nha_Tro.get(2).manhatro, "Phòng C3", "C", ds_Loai_Phong.get(2), ds_Nha_Tro.get(2), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("T4", ds_Loai_Phong.get(2).maloaiphong, ds_Nha_Tro.get(3).manhatro, "Phòng C4", "C", ds_Loai_Phong.get(2), ds_Nha_Tro.get(3), null, null, new ArrayList<BangGia>()));
		ds_Phong_Tro.add(new PhongTro("T5", ds_Loai_Phong.get(2).maloaiphong, ds_Nha_Tro.get(4).manhatro, "Phòng C5", "C", ds_Loai_Phong.get(2), ds_Nha_Tro.get(4), null, null, new ArrayList<BangGia>()));

		// Danh sach phong tro duoc sap xep theo tung nha tro
		ds_Nha_Tro.get(0).dsphongtro_nhatro.add(ds_Phong_Tro.get(0));
		ds_Nha_Tro.get(0).dsphongtro_nhatro.add(ds_Phong_Tro.get(5));
		ds_Nha_Tro.get(0).dsphongtro_nhatro.add(ds_Phong_Tro.get(10));

		ds_Nha_Tro.get(1).dsphongtro_nhatro.add(ds_Phong_Tro.get(1));
		ds_Nha_Tro.get(1).dsphongtro_nhatro.add(ds_Phong_Tro.get(6));
		ds_Nha_Tro.get(1).dsphongtro_nhatro.add(ds_Phong_Tro.get(11));

		ds_Nha_Tro.get(2).dsphongtro_nhatro.add(ds_Phong_Tro.get(2));
		ds_Nha_Tro.get(2).dsphongtro_nhatro.add(ds_Phong_Tro.get(7));
		ds_Nha_Tro.get(2).dsphongtro_nhatro.add(ds_Phong_Tro.get(12));

		ds_Nha_Tro.get(3).dsphongtro_nhatro.add(ds_Phong_Tro.get(3));
		ds_Nha_Tro.get(3).dsphongtro_nhatro.add(ds_Phong_Tro.get(8));
		ds_Nha_Tro.get(3).dsphongtro_nhatro.add(ds_Phong_Tro.get(13));

		ds_Nha_Tro.get(4).dsphongtro_nhatro.add(ds_Phong_Tro.get(4));
		ds_Nha_Tro.get(4).dsphongtro_nhatro.add(ds_Phong_Tro.get(9));
		ds_Nha_Tro.get(4).dsphongtro_nhatro.add(ds_Phong_Tro.get(14));

		// Danh sach phong duoc xep theo tung loai phong
		ds_Loai_Phong.get(0).dsphongtro_loai.add(ds_Phong_Tro.get(0));
		ds_Loai_Phong.get(0).dsphongtro_loai.add(ds_Phong_Tro.get(1));
		ds_Loai_Phong.get(0).dsphongtro_loai.add(ds_Phong_Tro.get(2));
		ds_Loai_Phong.get(0).dsphongtro_loai.add(ds_Phong_Tro.get(3));
		ds_Loai_Phong.get(0).dsphongtro_loai.add(ds_Phong_Tro.get(4));

		ds_Loai_Phong.get(1).dsphongtro_loai.add(ds_Phong_Tro.get(5));
		ds_Loai_Phong.get(1).dsphongtro_loai.add(ds_Phong_Tro.get(6));
		ds_Loai_Phong.get(1).dsphongtro_loai.add(ds_Phong_Tro.get(7));
		ds_Loai_Phong.get(1).dsphongtro_loai.add(ds_Phong_Tro.get(8));
		ds_Loai_Phong.get(1).dsphongtro_loai.add(ds_Phong_Tro.get(9));

		ds_Loai_Phong.get(2).dsphongtro_loai.add(ds_Phong_Tro.get(10));
		ds_Loai_Phong.get(2).dsphongtro_loai.add(ds_Phong_Tro.get(11));
		ds_Loai_Phong.get(2).dsphongtro_loai.add(ds_Phong_Tro.get(12));
		ds_Loai_Phong.get(2).dsphongtro_loai.add(ds_Phong_Tro.get(13));
		ds_Loai_Phong.get(2).dsphongtro_loai.add(ds_Phong_Tro.get(14));
	}

	public static void TaoDanhSachTrangBi()
	{
		// Trang bi cho phong tro binh dan
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(0).maphong, new GregorianCalendar(2017, 02, 01), new ArrayList<ThietBi>(), ds_Phong_Tro.get(0)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(1).maphong, new GregorianCalendar(2017, 02, 02), new ArrayList<ThietBi>(), ds_Phong_Tro.get(1)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(2).maphong, new GregorianCalendar(2017, 02, 03), new ArrayList<ThietBi>(), ds_Phong_Tro.get(2)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(3).maphong, new GregorianCalendar(2017, 02, 04), new ArrayList<ThietBi>(), ds_Phong_Tro.get(3)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(4).maphong, new GregorianCalendar(2017, 02, 05), new ArrayList<ThietBi>(), ds_Phong_Tro.get(4)));
		// Trang bi cho phong tro sinh vien
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(5).maphong, new GregorianCalendar(2017, 03, 06), new ArrayList<ThietBi>(), ds_Phong_Tro.get(5)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(6).maphong, new GregorianCalendar(2017, 03, 07), new ArrayList<ThietBi>(), ds_Phong_Tro.get(6)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(7).maphong, new GregorianCalendar(2017, 03, 8), new ArrayList<ThietBi>(), ds_Phong_Tro.get(7)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(8).maphong, new GregorianCalendar(2017, 03, 9), new ArrayList<ThietBi>(), ds_Phong_Tro.get(8)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(9).maphong, new GregorianCalendar(2017, 03, 10), new ArrayList<ThietBi>(), ds_Phong_Tro.get(9)));
		// Trang bi cho phong tro cao cap
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(10).maphong, new GregorianCalendar(2017, 03, 11), new ArrayList<ThietBi>(), ds_Phong_Tro.get(10)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(11).maphong, new GregorianCalendar(2017, 03, 12), new ArrayList<ThietBi>(), ds_Phong_Tro.get(11)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(12).maphong, new GregorianCalendar(2017, 03, 13), new ArrayList<ThietBi>(), ds_Phong_Tro.get(12)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(13).maphong, new GregorianCalendar(2017, 03, 14), new ArrayList<ThietBi>(), ds_Phong_Tro.get(13)));
		dsTrangBi.add(new TrangBi(ds_Phong_Tro.get(14).maphong, new GregorianCalendar(2017, 03, 15), new ArrayList<ThietBi>(), ds_Phong_Tro.get(14)));

		//Thêm danh sách thiết bị vào trang bị
		//Trọ gia đình bình dân
		dsTrangBi.get(0).dsThietBi_TB.add(dsThietBi.get(5));
		dsTrangBi.get(0).dsThietBi_TB.add(dsThietBi.get(15));
		dsTrangBi.get(0).dsThietBi_TB.add(dsThietBi.get(25));
		dsTrangBi.get(0).dsThietBi_TB.add(dsThietBi.get(45));
		dsTrangBi.get(0).dsThietBi_TB.add(dsThietBi.get(60));
		dsTrangBi.get(0).dsThietBi_TB.add(dsThietBi.get(70));
		dsTrangBi.get(0).dsThietBi_TB.add(dsThietBi.get(90));

		dsTrangBi.get(1).dsThietBi_TB.add(dsThietBi.get(6));
		dsTrangBi.get(1).dsThietBi_TB.add(dsThietBi.get(16));
		dsTrangBi.get(1).dsThietBi_TB.add(dsThietBi.get(26));
		dsTrangBi.get(1).dsThietBi_TB.add(dsThietBi.get(46));
		dsTrangBi.get(1).dsThietBi_TB.add(dsThietBi.get(61));
		dsTrangBi.get(1).dsThietBi_TB.add(dsThietBi.get(71));
		dsTrangBi.get(1).dsThietBi_TB.add(dsThietBi.get(91));

		dsTrangBi.get(2).dsThietBi_TB.add(dsThietBi.get(7));
		dsTrangBi.get(2).dsThietBi_TB.add(dsThietBi.get(17));
		dsTrangBi.get(2).dsThietBi_TB.add(dsThietBi.get(27));
		dsTrangBi.get(2).dsThietBi_TB.add(dsThietBi.get(47));
		dsTrangBi.get(2).dsThietBi_TB.add(dsThietBi.get(62));
		dsTrangBi.get(2).dsThietBi_TB.add(dsThietBi.get(72));
		dsTrangBi.get(2).dsThietBi_TB.add(dsThietBi.get(92));

		dsTrangBi.get(3).dsThietBi_TB.add(dsThietBi.get(8));
		dsTrangBi.get(3).dsThietBi_TB.add(dsThietBi.get(18));
		dsTrangBi.get(3).dsThietBi_TB.add(dsThietBi.get(28));
		dsTrangBi.get(3).dsThietBi_TB.add(dsThietBi.get(48));
		dsTrangBi.get(3).dsThietBi_TB.add(dsThietBi.get(63));
		dsTrangBi.get(3).dsThietBi_TB.add(dsThietBi.get(73));
		dsTrangBi.get(3).dsThietBi_TB.add(dsThietBi.get(93));

		dsTrangBi.get(4).dsThietBi_TB.add(dsThietBi.get(9));
		dsTrangBi.get(4).dsThietBi_TB.add(dsThietBi.get(19));
		dsTrangBi.get(4).dsThietBi_TB.add(dsThietBi.get(29));
		dsTrangBi.get(4).dsThietBi_TB.add(dsThietBi.get(49));
		dsTrangBi.get(4).dsThietBi_TB.add(dsThietBi.get(64));
		dsTrangBi.get(4).dsThietBi_TB.add(dsThietBi.get(74));
		dsTrangBi.get(4).dsThietBi_TB.add(dsThietBi.get(94));

		//Trọ sinh viên
		dsTrangBi.get(5).dsThietBi_TB.add(dsThietBi.get(0));
		dsTrangBi.get(5).dsThietBi_TB.add(dsThietBi.get(30));
		dsTrangBi.get(5).dsThietBi_TB.add(dsThietBi.get(50));
		dsTrangBi.get(5).dsThietBi_TB.add(dsThietBi.get(80));
		dsTrangBi.get(5).dsThietBi_TB.add(dsThietBi.get(85));

		dsTrangBi.get(6).dsThietBi_TB.add(dsThietBi.get(1));
		dsTrangBi.get(6).dsThietBi_TB.add(dsThietBi.get(31));
		dsTrangBi.get(6).dsThietBi_TB.add(dsThietBi.get(51));
		dsTrangBi.get(6).dsThietBi_TB.add(dsThietBi.get(81));
		dsTrangBi.get(6).dsThietBi_TB.add(dsThietBi.get(86));

		dsTrangBi.get(7).dsThietBi_TB.add(dsThietBi.get(2));
		dsTrangBi.get(7).dsThietBi_TB.add(dsThietBi.get(32));
		dsTrangBi.get(7).dsThietBi_TB.add(dsThietBi.get(52));
		dsTrangBi.get(7).dsThietBi_TB.add(dsThietBi.get(82));
		dsTrangBi.get(7).dsThietBi_TB.add(dsThietBi.get(87));

		dsTrangBi.get(8).dsThietBi_TB.add(dsThietBi.get(3));
		dsTrangBi.get(8).dsThietBi_TB.add(dsThietBi.get(33));
		dsTrangBi.get(8).dsThietBi_TB.add(dsThietBi.get(53));
		dsTrangBi.get(8).dsThietBi_TB.add(dsThietBi.get(83));
		dsTrangBi.get(8).dsThietBi_TB.add(dsThietBi.get(88));

		dsTrangBi.get(9).dsThietBi_TB.add(dsThietBi.get(4));
		dsTrangBi.get(9).dsThietBi_TB.add(dsThietBi.get(34));
		dsTrangBi.get(9).dsThietBi_TB.add(dsThietBi.get(54));
		dsTrangBi.get(9).dsThietBi_TB.add(dsThietBi.get(84));
		dsTrangBi.get(9).dsThietBi_TB.add(dsThietBi.get(89));

		//Trọ cao cấp
		dsTrangBi.get(10).dsThietBi_TB.add(dsThietBi.get(10));
		dsTrangBi.get(10).dsThietBi_TB.add(dsThietBi.get(20));
		dsTrangBi.get(10).dsThietBi_TB.add(dsThietBi.get(35));
		dsTrangBi.get(10).dsThietBi_TB.add(dsThietBi.get(40));
		dsTrangBi.get(10).dsThietBi_TB.add(dsThietBi.get(55));
		dsTrangBi.get(10).dsThietBi_TB.add(dsThietBi.get(65));
		dsTrangBi.get(10).dsThietBi_TB.add(dsThietBi.get(75));
		dsTrangBi.get(10).dsThietBi_TB.add(dsThietBi.get(95));

		dsTrangBi.get(11).dsThietBi_TB.add(dsThietBi.get(11));
		dsTrangBi.get(11).dsThietBi_TB.add(dsThietBi.get(21));
		dsTrangBi.get(11).dsThietBi_TB.add(dsThietBi.get(36));
		dsTrangBi.get(11).dsThietBi_TB.add(dsThietBi.get(41));
		dsTrangBi.get(11).dsThietBi_TB.add(dsThietBi.get(56));
		dsTrangBi.get(11).dsThietBi_TB.add(dsThietBi.get(66));
		dsTrangBi.get(11).dsThietBi_TB.add(dsThietBi.get(76));
		dsTrangBi.get(11).dsThietBi_TB.add(dsThietBi.get(96));

		dsTrangBi.get(12).dsThietBi_TB.add(dsThietBi.get(12));
		dsTrangBi.get(12).dsThietBi_TB.add(dsThietBi.get(22));
		dsTrangBi.get(12).dsThietBi_TB.add(dsThietBi.get(37));
		dsTrangBi.get(12).dsThietBi_TB.add(dsThietBi.get(42));
		dsTrangBi.get(12).dsThietBi_TB.add(dsThietBi.get(57));
		dsTrangBi.get(12).dsThietBi_TB.add(dsThietBi.get(67));
		dsTrangBi.get(12).dsThietBi_TB.add(dsThietBi.get(77));
		dsTrangBi.get(12).dsThietBi_TB.add(dsThietBi.get(97));

		dsTrangBi.get(13).dsThietBi_TB.add(dsThietBi.get(13));
		dsTrangBi.get(13).dsThietBi_TB.add(dsThietBi.get(23));
		dsTrangBi.get(13).dsThietBi_TB.add(dsThietBi.get(38));
		dsTrangBi.get(13).dsThietBi_TB.add(dsThietBi.get(43));
		dsTrangBi.get(13).dsThietBi_TB.add(dsThietBi.get(58));
		dsTrangBi.get(13).dsThietBi_TB.add(dsThietBi.get(68));
		dsTrangBi.get(13).dsThietBi_TB.add(dsThietBi.get(78));
		dsTrangBi.get(13).dsThietBi_TB.add(dsThietBi.get(98));

		dsTrangBi.get(14).dsThietBi_TB.add(dsThietBi.get(14));
		dsTrangBi.get(14).dsThietBi_TB.add(dsThietBi.get(24));
		dsTrangBi.get(14).dsThietBi_TB.add(dsThietBi.get(39));
		dsTrangBi.get(14).dsThietBi_TB.add(dsThietBi.get(44));
		dsTrangBi.get(14).dsThietBi_TB.add(dsThietBi.get(59));
		dsTrangBi.get(14).dsThietBi_TB.add(dsThietBi.get(69));
		dsTrangBi.get(14).dsThietBi_TB.add(dsThietBi.get(79));
		dsTrangBi.get(14).dsThietBi_TB.add(dsThietBi.get(99));

		//Gán trang bị cho từng thiết bị
		dsThietBi.get(5).TrangB = dsTrangBi.get(0);
		dsThietBi.get(15).TrangB = dsTrangBi.get(0);
		dsThietBi.get(25).TrangB = dsTrangBi.get(0);
		dsThietBi.get(45).TrangB = dsTrangBi.get(0);
		dsThietBi.get(60).TrangB = dsTrangBi.get(0);
		dsThietBi.get(70).TrangB = dsTrangBi.get(0);
		dsThietBi.get(90).TrangB = dsTrangBi.get(0);

		dsThietBi.get(6).TrangB = dsTrangBi.get(1);
		dsThietBi.get(16).TrangB = dsTrangBi.get(1);
		dsThietBi.get(26).TrangB = dsTrangBi.get(1);
		dsThietBi.get(46).TrangB = dsTrangBi.get(1);
		dsThietBi.get(61).TrangB = dsTrangBi.get(1);
		dsThietBi.get(71).TrangB = dsTrangBi.get(1);
		dsThietBi.get(91).TrangB = dsTrangBi.get(1);

		dsThietBi.get(7).TrangB = dsTrangBi.get(2);
		dsThietBi.get(17).TrangB = dsTrangBi.get(2);
		dsThietBi.get(27).TrangB = dsTrangBi.get(2);
		dsThietBi.get(47).TrangB = dsTrangBi.get(2);
		dsThietBi.get(62).TrangB = dsTrangBi.get(2);
		dsThietBi.get(72).TrangB = dsTrangBi.get(2);
		dsThietBi.get(2).TrangB = dsTrangBi.get(2);

		dsThietBi.get(8).TrangB = dsTrangBi.get(3);
		dsThietBi.get(18).TrangB = dsTrangBi.get(3);
		dsThietBi.get(28).TrangB = dsTrangBi.get(3);
		dsThietBi.get(48).TrangB = dsTrangBi.get(3);
		dsThietBi.get(63).TrangB = dsTrangBi.get(3);
		dsThietBi.get(73).TrangB = dsTrangBi.get(3);
		dsThietBi.get(93).TrangB = dsTrangBi.get(3);

		dsThietBi.get(9).TrangB = dsTrangBi.get(4);
		dsThietBi.get(19).TrangB = dsTrangBi.get(4);
		dsThietBi.get(29).TrangB = dsTrangBi.get(4);
		dsThietBi.get(49).TrangB = dsTrangBi.get(4);
		dsThietBi.get(64).TrangB = dsTrangBi.get(4);
		dsThietBi.get(74).TrangB = dsTrangBi.get(4);
		dsThietBi.get(94).TrangB = dsTrangBi.get(4);

		dsThietBi.get(0).TrangB = dsTrangBi.get(5);
		dsThietBi.get(30).TrangB = dsTrangBi.get(5);
		dsThietBi.get(50).TrangB = dsTrangBi.get(5);
		dsThietBi.get(80).TrangB = dsTrangBi.get(5);
		dsThietBi.get(85).TrangB = dsTrangBi.get(5);

		dsThietBi.get(1).TrangB = dsTrangBi.get(6);
		dsThietBi.get(31).TrangB = dsTrangBi.get(6);
		dsThietBi.get(51).TrangB = dsTrangBi.get(6);
		dsThietBi.get(81).TrangB = dsTrangBi.get(6);
		dsThietBi.get(86).TrangB = dsTrangBi.get(6);

		dsThietBi.get(2).TrangB = dsTrangBi.get(7);
		dsThietBi.get(32).TrangB = dsTrangBi.get(7);
		dsThietBi.get(52).TrangB = dsTrangBi.get(7);
		dsThietBi.get(82).TrangB = dsTrangBi.get(7);
		dsThietBi.get(87).TrangB = dsTrangBi.get(7);

		dsThietBi.get(3).TrangB = dsTrangBi.get(8);
		dsThietBi.get(33).TrangB = dsTrangBi.get(8);
		dsThietBi.get(53).TrangB = dsTrangBi.get(8);
		dsThietBi.get(83).TrangB = dsTrangBi.get(8);
		dsThietBi.get(88).TrangB = dsTrangBi.get(8);

		dsThietBi.get(4).TrangB = dsTrangBi.get(9);
		dsThietBi.get(44).TrangB = dsTrangBi.get(9);
		dsThietBi.get(54).TrangB = dsTrangBi.get(9);
		dsThietBi.get(84).TrangB = dsTrangBi.get(9);
		dsThietBi.get(89).TrangB = dsTrangBi.get(9);

		dsThietBi.get(10).TrangB = dsTrangBi.get(10);
		dsThietBi.get(20).TrangB = dsTrangBi.get(10);
		dsThietBi.get(35).TrangB = dsTrangBi.get(10);
		dsThietBi.get(40).TrangB = dsTrangBi.get(10);
		dsThietBi.get(55).TrangB = dsTrangBi.get(10);
		dsThietBi.get(65).TrangB = dsTrangBi.get(10);
		dsThietBi.get(75).TrangB = dsTrangBi.get(10);
		dsThietBi.get(95).TrangB = dsTrangBi.get(10);

		dsThietBi.get(11).TrangB = dsTrangBi.get(11);
		dsThietBi.get(21).TrangB = dsTrangBi.get(11);
		dsThietBi.get(36).TrangB = dsTrangBi.get(11);
		dsThietBi.get(41).TrangB = dsTrangBi.get(11);
		dsThietBi.get(56).TrangB = dsTrangBi.get(11);
		dsThietBi.get(66).TrangB = dsTrangBi.get(11);
		dsThietBi.get(76).TrangB = dsTrangBi.get(11);
		dsThietBi.get(96).TrangB = dsTrangBi.get(11);

		dsThietBi.get(12).TrangB = dsTrangBi.get(12);
		dsThietBi.get(22).TrangB = dsTrangBi.get(12);
		dsThietBi.get(37).TrangB = dsTrangBi.get(12);
		dsThietBi.get(42).TrangB = dsTrangBi.get(12);
		dsThietBi.get(57).TrangB = dsTrangBi.get(12);
		dsThietBi.get(67).TrangB = dsTrangBi.get(12);
		dsThietBi.get(77).TrangB = dsTrangBi.get(12);
		dsThietBi.get(97).TrangB = dsTrangBi.get(12);

		dsThietBi.get(13).TrangB = dsTrangBi.get(13);
		dsThietBi.get(23).TrangB = dsTrangBi.get(13);
		dsThietBi.get(38).TrangB = dsTrangBi.get(13);
		dsThietBi.get(43).TrangB = dsTrangBi.get(13);
		dsThietBi.get(58).TrangB = dsTrangBi.get(13);
		dsThietBi.get(68).TrangB = dsTrangBi.get(13);
		dsThietBi.get(78).TrangB = dsTrangBi.get(13);
		dsThietBi.get(98).TrangB = dsTrangBi.get(13);

		dsThietBi.get(14).TrangB = dsTrangBi.get(14);
		dsThietBi.get(24).TrangB = dsTrangBi.get(14);
		dsThietBi.get(39).TrangB = dsTrangBi.get(14);
		dsThietBi.get(44).TrangB = dsTrangBi.get(14);
		dsThietBi.get(59).TrangB = dsTrangBi.get(14);
		dsThietBi.get(69).TrangB = dsTrangBi.get(14);
		dsThietBi.get(79).TrangB = dsTrangBi.get(14);
		dsThietBi.get(99).TrangB = dsTrangBi.get(14);
		//Gán trang bị cho từng phòng trọ
		ds_Phong_Tro.get(0).trangBi = dsTrangBi.get(0);//Trang bị cho phòng trọ bình dân
		ds_Phong_Tro.get(1).trangBi = dsTrangBi.get(1);
		ds_Phong_Tro.get(2).trangBi = dsTrangBi.get(2);
		ds_Phong_Tro.get(3).trangBi = dsTrangBi.get(3);
		ds_Phong_Tro.get(4).trangBi = dsTrangBi.get(4);

		ds_Phong_Tro.get(5).trangBi = dsTrangBi.get(5);//Trang bị cho phòng trọ sinh viên
		ds_Phong_Tro.get(6).trangBi = dsTrangBi.get(6);
		ds_Phong_Tro.get(7).trangBi = dsTrangBi.get(7);
		ds_Phong_Tro.get(8).trangBi = dsTrangBi.get(8);
		ds_Phong_Tro.get(9).trangBi = dsTrangBi.get(9);

		ds_Phong_Tro.get(10).trangBi = dsTrangBi.get(10);//Trang bị cho phòng trọ cao cấp 
		ds_Phong_Tro.get(11).trangBi = dsTrangBi.get(11);
		ds_Phong_Tro.get(12).trangBi = dsTrangBi.get(12);
		ds_Phong_Tro.get(13).trangBi = dsTrangBi.get(13);
		ds_Phong_Tro.get(14).trangBi = dsTrangBi.get(14);
	}
	
	public static void Lambda1()
    {
        // Lambda1 dùng Count để đếm và xuất ra màn hình tổng số lượng khách thuê phòng trọ
        long soluongkhach = dsKhach.stream().count();
        System.out.println("Số lượng khách thuê phòng trọ: "+soluongkhach+" khách");
    }
    
    public static void Lambda2()
    {
        // Lambda2 xác định và xuất ra màn hình thông tin các nhân viên là nữ
    	final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        List<NhanVien> nhaviennu = dsNhanVien.stream().filter(n->n.gioiTinh=="Nữ")
        												.collect(Collectors.toList());
        System.out.println("Thông tin về các nhân viên nữ: -----------------------------------------------------------------------------------");
        for (NhanVien n : nhaviennu)
        {
        	System.out.println("\tMã nhân viên: "+n.getMaNV()+"\tHọ và tên: "+n.getHoTen()+"\tGiới tính: "+n.getGioiTinh()+
        			"\tNgày sinh: "+df.format(n.getNgaySinh().getTime())+"\tCCCD: "+n.getCCCD()+"\tQuê quán: "+n.getQueQuan());
        }
    }
    
    public static void Lambda3()
    {
        // Lambda3 nhóm và xuất ra màn hình danh sách khách được nhóm theo quê quán
    	final DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Map<String, List<Khach>> theoquequan = dsKhach.stream().collect(Collectors.groupingBy(Khach::getQueQuan));
        System.out.println("Danh sách khách được nhóm theo quê quán: -----------------------------------------------------------------------");
        Set<String> quequan=theoquequan.keySet();
        for(String g : quequan)
        {
        	System.out.println("Các khách có quê quán ở "+g+":");
            for(Khach q : theoquequan.get(g))
            {
            	System.out.println("\tMã khách hàng: "+q.getMaKH()+"\tMã loại khách hàng: "+q.getMaloaiKH()+"\tHọ và tên: "+q.getHoTen()+
            			"\tGiới tính: "+q.getGioiTinh()+"\tNgày sinh: "+df.format(q.getNgaySinh().getTime())+"\tCăn cước công dân: "+q.getCCCD()+
            			"\tQuê quán: "+q.getQueQuan()+"\tNghề nghiệp: "+q.getNgheNghiep());
            }
        }
    }
    
    public static void Lambda4()
    {
        // Lambda4 sắp xếp và xuất ra màn hình danh sách chi tiết hợp đồng thuê phòng tăng dần theo mã phòng
    	final DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        List<ChiTietHDThuePhong> xepmaphong = dsChiTietHDThuePhong
        		.stream()
        		.sorted(Comparator.comparing(ChiTietHDThuePhong::getMaphong))
        		.collect(Collectors.toList());
        System.out.println("Danh sách chi tiết hợp đồng xếp tăng dần theo mã phòng: ---------------------------------------------------------");
        for (ChiTietHDThuePhong n : xepmaphong)
        {
        	System.out.println("\tMã phòng: "+n.getMaphong()+"\tNgày giờ đăng kí: "+df1.format(n.getNgaygiodangki().getTime())+
        			"\tSố hợp đồng thuê: "+n.getSoHDThue()+"\tTiền đặt cọc: "+n.getTiendatcoc()+" vnd\tNgày dọn vào: "+df1.format(n.getNgaydonvao().getTime())+
        			"\tNgày dọn ra: "+df1.format(n.getNgaydonra().getTime()));
        }
    }
    
    public static void Lambda5()
    {
        // Lambda5 nối và xuất ra tất cả tên của nhân viên và khách 
    	String [] tenkhach=new String[(int) dsKhach.stream().count()], tennhanvien=new String[(int)dsNhanVien.stream().count()];
    	int i=0;
    	for(Khach k : dsKhach)
    	{
    		tenkhach[i]=k.getHoTen();
    		i++;
    	}
    	int j=0;
    	for(NhanVien n : dsNhanVien)
    	{
    		tennhanvien[j]=n.getHoTen();
    		j++;
    	}
        String [] tenkhachnhanvien = Stream.concat(Arrays.stream(tenkhach), Arrays.stream(tennhanvien)).toArray(String[]::new);
        System.out.println("Tên tất cả nhân viên và khách: -----------------------------------------------------------------------------------");
        for(String n : tenkhachnhanvien)
        {
        	System.out.println("\t"+n);
        }
    }
    
	public static void Lambda6()
    {
        //Cho biết dịch vụ mắc nhất
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////////////CHO BIẾT DỊCH VỤ CÓ GIÁ MẮC NHẤT////////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");

        DichVu macNhat = dsDichVu.stream().max(Comparator.comparing(DichVu::getGiaDichVu)).get();

        //DichVu dichVu = dsDichVu.stream().filter(b -> b.giaDichVu == macNhat).findFirst().get();

        System.out.println("- Dịch vụ có giá mắc nhất: "+ macNhat.tenDichVu);
        System.out.println("- Mã: "+ macNhat.maDichVu);
        System.out.println("- Loại dịch vụ: "+ macNhat.LoaiDV.tenLoaiDichVu);
        System.out.println("- Chi phí: " + macNhat.giaDichVu +  " VNĐ");
    }
	
	public static void Lambda7()
    {
        //Cho biết danh sách dịch vụ theo loại dịch vụ
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////CHO BIẾT DANH SÁCH DỊCH VỤ THEO LOẠI DỊCH VỤ//////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");

        List<LoaiDichVu> dsLoai = dsLoaiDichVu.stream().collect(Collectors.toList());

        for(LoaiDichVu loai:dsLoai)
        {
        	System.out.println("- Loại dịch vụ: " + loai.tenLoaiDichVu);       
        	for(DichVu dv:loai.dsDichVu_Loai)
        	{
        		System.out.println( " + Tên: " + dv.tenDichVu);
        		System.out.println( "   Mã dịch vụ: " + dv.maDichVu);
        		System.out.println( "   Chi phí: " + dv.giaDichVu + " VNĐ");
        		System.out.println( "   Chi tiết: " + dv.chiTietDichVu);
        	}
        }
    }
	
	public static void Lambda8()
    {
        //Cho biết những thiết bị nào có giá trên 5000000VNĐ
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////CHO BIẾT NHỮNG THIẾT BỊ NÀO CÓ GIÁ TRÊN 5 TRIỆU ĐỒNG//////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");

        List<ThietBi> thietBi = dsThietBi.stream().filter(t->t.giaThietBi>=5000000).collect(Collectors.toList());
        System.out.println("Những thiết bị có giá trên 5 triệu đồng: ");
        for(ThietBi tb:thietBi)
        {
            System.out.println("- Thiết bị: " + tb.tenThietBi);
            System.out.println(" + Mã: " + tb.maThietBi);
            System.out.println(" + Loại: " + tb.LoaiTB.tenLoaiThietBi);
            System.out.println(" + Giá: " + tb.giaThietBi + " VNĐ");
            System.out.println(" + Bảo hành: " + tb.thoiGianBaoHanh + " tháng");
        }
    }
	
	public static void Lambda9()
    {
        //Cho biết mỗi dịch vụ được sử dụng bởi bao nhiêu phòng
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("//////////////////CHO BIẾT MỖI DỊCH VỤ ĐƯỢC BAO NHIÊU PHÒNG SỬ DỤNG///////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");

        List<DichVu> dsDV = dsDichVu.stream().collect(Collectors.toList());
        System.out.println("Số phòng sử dụng các dịch vụ:");
        for (DichVu dv:dsDV)
            System.out.println("- " + dv.tenDichVu + ":" + dv.dsChiTietSDDichVu_DV.stream().count() + " phòng");
    }
	
	public static void Lambda10()
    {
        //Tính tổng tiền trang bị cho mỗi phòng
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("////////////////////////TÍNH TỔNG TIỀN TRANG BỊ CHO MỖI PHÒNG/////////////////////////");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////");

        List<TrangBi> dsTB = dsTrangBi.stream().collect(Collectors.toList());        
        System.out.println("Số tiền dành cho trang bị mỗi phòng: ");
        final DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        for (TrangBi tb:dsTB)
        {
        	long chiPhi=tb.dsThietBi_TB.stream().mapToLong(a->(a.soLuong*a.giaThietBi)).sum();
            System.out.println("- " + tb.PTro.tenphong + " được trang bị vào " + df.format(tb.ngayGio.getTime()) +            
            " và tốn " + chiPhi + " VNĐ");
        }
    }
	
	public static void Lambda11()
    {
        System.out.println();
		System.out.println("*********** MÃ PHÒNG, MÃ LOẠI PHÒNG, MÃ NHÀ TRỌ VÀ TÊN PHÒNG CỦA NHÀ TRỌ **********");
        System.out.println();

        List<PhongTro> dsphong = ds_Phong_Tro
        		.stream()
        		.collect(Collectors.toList());
        
        for(PhongTro phong:dsphong)
        {
        	System.out.println("Mã nhà trọ: "+phong.manhatro+"\t-\tMã loại phòng: "+phong.maloaiphong+ "\t - \tMã phòng: "+phong.maphong+ "\t - \tTên phòng: "+phong.tenphong);
            System.out.println();
        }
    }
    
    public static void Lambda12()
    {
    	System.out.println("*********** MÃ NHÀ TRỌ, MÃ LOẠI PHÒNG, TÊN PHÒNG ĐƯỢC SẮP THEO DÃY PHÒNG TRỌ **********");
        System.out.println();
        
    	Map<String, List<PhongTro>> theoday = ds_Phong_Tro.stream().collect(Collectors.groupingBy(PhongTro::getDay));
        Set<String> phongtro=theoday.keySet();
        for(String d : phongtro)
        {
        	System.out.println("Dãy phòng: "+d);
            System.out.println();
            for(PhongTro tro : theoday.get(d))
            {
            	System.out.println("\tMã nhà trọ: "+tro.getManhatro()+"\tLoại phòng: "+tro.getMaloaiphong()+"\tTên phòng: "+tro.getTenphong());
                System.out.println();
            }
         }
     }
    
    public static void Lambda13()
    {
		System.out.println("*********** BẢNG GIÁ PHÒNG LỚN NHẤT TÌM ĐƯỢC **********");
        System.out.println();

    	BangGia Max=ds_Bang_Gia.stream().max(Comparator.comparing(BangGia::getGia)).get();
    	{
    		System.out.println("Giá phòng: "+Max.gia+ "VNĐ");
            System.out.println();
    	}
    }
    
    
    public static void Lambda14()
    {
		System.out.println("*********** TỔNG SỐ TIỀN MÀ CÁC NHÀ TRỌ THU ĐƯỢC **********");
        System.out.println();

    	int sum = ds_Bang_Gia.stream().collect(Collectors.summingInt(BangGia::getGia));
    	{
    		System.out.println("Tổng giá tiền: "+sum+"VNĐ");
            System.out.println();
    	}   	
    }
    
    public static void Lambda15()
    {
		System.out.println("*********** DANH SÁCH CÁC PHÒNG CÒN TRỐNG **********");
        System.out.println();

    	List<PhongTro> ptr=ds_Phong_Tro.stream().filter(t->t.chitiethd==null).collect(Collectors.toList());
    	for(PhongTro Tenphong:ptr)
    	{
    		System.out.println("Tên phòng: "+Tenphong.tenphong);
            System.out.println();
    	}
    }
    
	public static void main(String[] args) 
	{
		TaodanhsachLoaiKH();
        TaodanhsachKhach();
        TaodanhsachNhanVien();
        TaodanhsachHopDongThuePhong();
        TaoDanhSachLoaiDichVu();
        TaoDanhSachDichVu();
        TaoDanhSachLoaiThietBi();
        TaoDanhSachThietBi();
        TaoDanhSachLoaiPhong();
        TaoDanhSachNhaTro();
        TaoDanhSachPhongTro();
        TaoDanhSachBangGia();
        TaoDanhSachChiTietHDThuePhong();
        TaoDanhSachChiTietSuDungDichVu();
        TaoDanhSachTrangBi();
        
        Lambda1();
        Lambda2();
        Lambda3();
        Lambda4();
        Lambda5();
        
        Lambda6();
        Lambda7();
        Lambda8();
        Lambda9();
        Lambda10();
        
        Lambda11();
        Lambda12();
        Lambda13();
        Lambda14();
        Lambda15();
	}
}
