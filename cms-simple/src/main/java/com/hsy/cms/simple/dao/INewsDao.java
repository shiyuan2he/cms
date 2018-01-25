package com.hsy.cms.simple.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hsy.cms.simple.model.News;
import com.hsy.cms.simple.util.Constant;
	
@Mapper
public interface INewsDao {
	
	@Select("SELECT * FROM t_news WHERE ID = #{id};")
	News findById(News news);
	
	@Select({
		"<script>",
		"SELECT N.*,C.NAME AS CATEGORYNAME,C.IMAGE AS CATEGORYIMAGE FROM t_news N ",
		"LEFT JOIN t_news_category C ON N.CATEGORY = C.ID ",
		"WHERE N.STATE = 1 ",
			"<when test='title!=null'>",
				"AND N.TITLE LIKE CONCAT('%',#{title},'%')",
			"</when>",
			"<when test='category!=0'>",
				"AND category = #{category}",
			"</when>",
			"<when test='commendState!=0'>",
				"AND commendState = #{commendState}",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByAddDateAsc+"\"'>",
				"order by "+Constant.OrderByAddDateAsc+",addDate desc",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByAddDateDesc+"\"'>",
				"order by "+Constant.OrderByAddDateDesc,
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByBrowsesDesc+"\"'>",
				"order by "+Constant.OrderByBrowsesDesc+",addDate desc",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByCommentsDesc+"\"'>",
				"order by "+Constant.OrderByCommentsDesc+",addDate desc",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByLikesDesc+"\"'>",
				"order by "+Constant.OrderByLikesDesc+",addDate desc",
			"</when>",
			"<when test='orderBy==\""+Constant.OrderByScoreDesc+"\"'>",
				"order by "+Constant.OrderByScoreDesc+",addDate desc",
			"</when>",
			"limit #{start},#{end}",
		"</script>"
	})
	List<News> list(News news);
	
	@Select({
		"<script>",
		"SELECT COUNT(*) FROM t_news N ",
		"LEFT JOIN t_news_category C ON N.CATEGORY = C.ID ",
		"WHERE N.STATE = 1 ",
			"<when test='title!=null'>",
				"AND N.TITLE LIKE CONCAT('%',#{title},'%')",
			"</when>",
			"<when test='category!=0'>",
				"AND category = #{category}",
			"</when>",
			"<when test='commendState!=0'>",
				"AND commendState = #{commendState}",
			"</when>",
		"</script>"
	})
	int count(News news);
	
	@Insert("INSERT INTO `t_news` (`id`,`title`,`description`,`category`,`image`,`content`,`addDate`,`updateDate`,`commendState`,`state`,`browses`,`likes`,`comments`,`score`) VALUES (null,#{title},#{description},#{category},#{image},#{content},now(),now(),1,1,0,0,0,0);")
	int insert(News news);

	@Update("UPDATE `t_news` SET `title` = #{title}, `description` = #{description}, `category` = #{category}, `image` = #{image}, `content` = #{content}, `updateDate` = now()  WHERE `id` = #{id};")
	int update(News news);
	
	@Update("UPDATE `t_news` SET `state` = #{state}, `commendState` = #{commendState}, `browses` = #{browses}, `likes` = #{likes}, `comments` = #{comments}, `score` = #{score} WHERE `id` = #{id};")
	int updateState(News news);
	
}
