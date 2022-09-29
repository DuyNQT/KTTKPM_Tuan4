package com.example.chuyenbay.service;

import java.util.List;

import com.example.chuyenbay.entity.NhanVien;

public interface NhanVienService {
//	3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	public List<NhanVien> findByLuongNhoHon10000();
}
