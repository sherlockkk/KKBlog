package cn.tycoding.admin.mapper;

import cn.tycoding.admin.entity.ArticleCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.authz.annotation.RequiresRoles;

/**
 * @auther TyCoding
 * @date 2018/10/22
 */
@Mapper
public interface ArticleCategoryMapper {

  @RequiresRoles("admin")
  int save(ArticleCategory articleCategory);

  boolean exists(@Param("articleId") long articleId, @Param("categoryId") long categoryId);

  int delete(long id);
}
