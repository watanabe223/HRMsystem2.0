package cn.edu.guet.mapper;

import cn.edu.guet.bean.Performance;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PerformanceMapper {
    List<Performance> viewPerform();
    List<Performance> personPerform(String emp_id);
    int updatePerform(Performance performance);
    Performance getPerform(String person_perfor_key);
   void performsave(String emp_id, String month);
}
