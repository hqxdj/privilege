package com.zrht.privilege.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户与用户组的关系表
 * </p>
 *
 * @author xdj
 * @since 2019-07-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_u_group")
public class UserUGroup implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 关系id
     */
    @TableId(value = "user_relation_id", type = IdType.AUTO)
    private Integer userRelationId;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 用户组id
     */
    @TableField("user_group_id")
    private Integer userGroupId;

    @TableField("ver")
    private String ver;

    @TableField("create_date")
    private Date createDate;

    @TableField("create_id")
    private Integer createId;

    @TableField("update_date")
    private Date updateDate;

    @TableField("update_id")
    private Integer updateId;

    @TableField("etc1")
    private String etc1;

    @TableField("etc2")
    private String etc2;

    @TableField("etc3")
    private String etc3;

    @TableField("etc4")
    private String etc4;


    public static final String USER_RELATION_ID = "user_relation_id";

    public static final String USER_ID = "user_id";

    public static final String USER_GROUP_ID = "user_group_id";

    public static final String VER = "ver";

    public static final String CREATE_DATE = "create_date";

    public static final String CREATE_ID = "create_id";

    public static final String UPDATE_DATE = "update_date";

    public static final String UPDATE_ID = "update_id";

    public static final String ETC1 = "etc1";

    public static final String ETC2 = "etc2";

    public static final String ETC3 = "etc3";

    public static final String ETC4 = "etc4";

}
