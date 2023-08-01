# Tên đề tài: ỨNG DỤNG CÔNG NGHỆ LINQ TRONG MÔ PHỎNG HỆ THỐNG QUẢN LÝ PHÒNG TRỌ
#### TRƯỜNG ĐẠI HỌC SƯ PHẠM KỸ THUẬT TP.HỒ CHÍ MINH, KHOA CÔNG NGHỆ THÔNG TIN
#### BỘ MÔN: LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG
#### MÃ SỐ LỚP HP: OOPR230279_21_1_08, GVHD: GVC.THS. NGUYỄN MINH ĐẠO, HỌC KỲ: I – NĂM HỌC: 2021 - 2022
#### NHÓM THỰC HIỆN: NHÓM 7
### DANH SÁCH THÀNH VIÊN THAM GIA ĐỀ TÀI
#### Phan Quan Huy	20110652
#### Nguyễn Văn Sang  20110711
#### Nguyễn Văn Thuận	20110732
### GIỚI THIỆU ĐỀ TÀI
- Mô phỏng hệ thống quản lý phòng trọ với nội dung chi tiết như sau:
- Hệ thống phòng trọ gồm nhiều loại khách hàng, nhân viên, phòng trọ, dịch vụ và thiết bị.
- Mỗi loại khách hàng có một mã phân biệt và các thông tin cụ thể liên quan.
- Mỗi khách hàng có thể kí hợp đồng thuê phòng với một nhân viên và sử dụng các dịch vụ trong phòng trọ.
- Mỗi phòng trọ thuộc về một loại phòng trọ và một nhà trọ, có một mã phòng và một bảng giá phòng.
- Mỗi phòng trọ được trang bị nhiều thiết bị thuộc nhiều loại thiết bị khác nhau.
### NỀN TẢNG THỰC HIỆN
Đồ án được thực hiện sử dụng:
-	Ngôn ngữ lập trình C#, Java.
(Phiên bản C# xem ở: https://github.com/Nguyenvsang/OOP_QuanLyPhongTro_C_Sharp)
-	Giao diện Terminal.
-	Công nghệ LINQ.
### XÂY DỰNG SƠ ĐỒ ERD
![image](https://github.com/Nguyenvsang/OOP_QuanLyPhongTro_Java/assets/80632518/a331515d-e798-4f64-a665-912b6933f14d)
## XÂY DỰNG SƠ ĐỒ QUAN HỆ
### BẢNG QUAN HỆ CƠ SỞ (ENTITY RELATIONS)
1.	LoaiKH (KC:maloaiKH, tenloaiKH)
2.	Khach (KC:maKH, KN:maloaiKH , hoTen, gioiTinh, ngaySinh, cCCD, 
queQuan, ngheNghiep)
3.	NhanVien (KC:maNV, hoTen, gioiTinh, ngaySinh, cCCD, queQuan)
4.	HopDongThuePhong (KC:soHDThue, KN:maKH, KN:maNV)
5.	LoaiDichVu (KC:maLoaiDichVu, tenLoaiDichVu)
6.	DichVu (KC:maDichVu, KN:maLoaiDichVu, tenDichVu, chiTietDichVu, giaDichVu)
7.	LoaiThietBi (KC:maLoaiThietBi, tenLoaiThietBi)
8.	ThietBi (KC:maThietBi, KN:maLoaiThietBi, tenThietBi, giaThietBi, soLuong, thoiGianBaoHanh)
9.	LoaiPhong (KC:maloaiphong, tenloaiphong, dientichphong)
10.	NhaTro (KC:manhatro, tennhatro, khuvuc)
11.	PhongTro (KC:maphong, KN:maloaiphong, KN:manhatro, tenphong, day)
12.	BangGia ( KC:mabanggia, KN:maphong, gia)
### BẢNG QUAN HỆ LIÊN KẾT (RELATIONSHIP RELATIONS)
13.	ChiTietHDThuePhong (KN:maphong, ngaygiodangki, soHDThue, tiendatcoc, ngaydonvao, ngaydonra)
14.	ChiTietSuDungDV (KN:maphong, ngayGioDangKi)
15.	TrangBi (KN:maphong, ngaygio)
#### *Ghi chú: 
- KC: khoá chính
- KN: khoá ngoại
## DANH SÁCH CÂU TRUY VẤN
### C#
1.	Cho biết tổng số lượng khách thuê phòng trọ.
2.	Cho biết thông tin về khách thứ x (0<x< =tổng số khách).
3.	Cho biết thông tin của các nhân viên nữ.
4.	Cho biết các danh sách khách được nhóm theo quê quán.
5.	Xuất ra danh sách chi tiết hợp đồng thuê phòng được sắp xếp giảm dần theo mã phòng.
6.	Cho biết tất cả tên của nhân viên và khách.
7.	Cho biết thông tin 3 khách đầu tiên có tên loại khách hàng là sinh viên.
8.	Cho biết thông tin về các hợp đồng thực hiện vào năm 2020.
9.	Cho biết thông tin về bất kỳ nhóm khách nào (xếp theo loại khách hàng) có 1 khách dùng từ 3 dịch vụ.
10.	Cho biết những năm sinh có ở cả khách và nhân viên.
11.	Cho biết 3 thiết bị mà phòng C1 có mã “T1” sử dụng.
12.	Cho biết dịch vụ có giá mắc nhất.
13.	Cho biết danh sách dịch vụ theo loại dịch vụ.
14.	Cho biết những thiết bị nào có giá trên 5 triệu đồng.
15.	Cho biết mỗi dịch vụ được bao nhiêu phòng sử dụng.
16.	Tính tổng tiền trang bị cho mỗi phòng.
17.	Tìm thông tin dịch vụ “Dọn dẹp”.
18.	Cho biết những dịch vụ nào được sử dụng nhiều nhất.
19.	Sắp xếp danh sách trang bị theo thời gian trang bị.
20.	 Liệt kê danh sách thiết bị (không bao gồm thiết bị giống nhau).
21.	Cho biết loại phòng và tên phòng trọ được phân theo dãy.
22.	Cho biết mã bảng giá và giá tiền phòng của các nhà trọ.
23.	Sắp xếp mã phòng và giá tiền phòng giảm dần theo giá tiền.
24.	 Cần tìm nhà trọ theo mã nhà trọ.
25.	 Cho biết khu vực của nhà trọ và các loại phòng hiện có.
26.	Cho biết tên loại phòng và diện tích của phong trọ.
27.	Cho biết mã bảng giá và mã phòng có giá nhỏ hơn 2500000VNĐ.
28.	 Cho biết một số tên nhà trọ đầu tiên trong danh sách nhà trọ.
29.	Tìm các phòng trọ chưa có khách thuê ở.
30.	Tổng số tiền thu được của chủ trọ theo giá tiền tương ứng.
### JAVA
1.	Cho biết tổng số lượng khách thuê phòng trọ.
2.	Cho biết thông tin của các nhân viên nữ.
3.	Cho biết các danh sách khách được nhóm theo quê quán.
4.	Xuất ra danh sách chi tiết hợp đồng thuê phòng được sắp xếp tăng dần theo mã phòng.
5.	Cho biết tất cả tên của nhân viên và khách.
6.	Cho biết dịch vụ có giá mắc nhất.
7.	Cho biết danh sách dịch vụ theo loại dịch vụ.
8.	Cho biết những thiết bị nào có giá trên 5 triệu đồng.
9.	Cho biết mỗi dịch vụ được bao nhiêu phòng sử dụng.
10.	Tính tổng tiền trang bị cho mỗi phòng.
11.	Cho biết mã nhà trọ, mã loại phòng, mã phòng và tên phòng của nhà trọ.
12.	Cho biết mã nhà trọ, mã loại phòng và tên nhà trọ được sắp xếp theo dãy phòng trọ.
13.	Tìm ra giá tiền thuê phòng trọ lớn nhất.
14.	Tính tổng số tiền mà các nhà trọ trọ thu được trong một tháng.
15.	 Danh sách các phòng trọ hiện chưa có  khách thuê ở.
