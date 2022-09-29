package com.example.chuyenbay.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.chuyenbay.entity.NhanVien;
import com.example.chuyenbay.respository.NhanVienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService {
	@Autowired
	private NhanVienRepository nhanVienRespository;

	
	//3
	@Override
	public List<NhanVien> findByLuongNhoHon10000() {
		// TODO Auto-generated method stub
		return nhanVienRespository.findByLuongNhoHon10000();
	}
}
