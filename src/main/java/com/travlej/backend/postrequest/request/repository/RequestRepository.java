package com.travlej.backend.postrequest.request.repository;
import com.travlej.backend.postrequest.request.entity.Request;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface RequestRepository extends JpaRepository<Request, String> {

}
