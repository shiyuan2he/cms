package com.hsy.cms.simple.dao;

import java.util.List;

import com.hsy.cms.simple.model.NewsCategory;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface INewsCategoryDao {
	
	@Select("SELECT * FROM `t_news_category` where id = #{id};")
    NewsCategory findById(NewsCategory newsCategory);
	
	@Select({
		"<script>",
		"SELECT * FROM `t_news_category`",
		"WHERE state = 1",
			"<when test='name!=null'>",
				"AND name LIKE CONCAT('%',#{name},'%')",
			"</when>",
			"order by addDate desc limit #{start},#{end}",
		"</script>"
	})
	List<NewsCategory> list(NewsCategory newsCategory);
	
	@Select({
		"<script>",
		"SELECT count(*) FROM `t_news_category`",
		"WHERE state = 1",
			"<when test='name!=null'>",
				"AND name LIKE CONCAT('%',#{name},'%')",
			"</when>",
		"</script>"
	})
	int count(NewsCategory newsCategory);
	
	@Insert("INSERT INTO `t_news_category` (`id`, `name`, `description`, `image`, `addDate`, `state`) VALUES (null, #{name}, #{description}, #{image}, now(), 1);")
	int insert(NewsCategory newsCategory);
	
	@Update("UPDATE `t_news_category` SET `name` = #{name}, `description` = #{description}, `image` = #{image} WHERE `id` = #{id};")
	int update(NewsCategory newsCategory);
	
	@Update("UPDATE `t_news_category` SET `state` = #{state} WHERE `id` = #{id};")
	int updateState(NewsCategory newsCategory);
}
