package com.hsy.blog.mapper;

import com.hsy.blog.vo.LogInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author eumji
 * @package com.hsy.cms.simple.mapper
 * @name LogDao
 * @date 2017/4/10
 * @time 18:161
 */
@Mapper
public interface LogMapper {
    /**
     * 保存日志信息
     * @param log
     */
    void save(LogInfo log);
}
