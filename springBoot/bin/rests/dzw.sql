/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.5.28 : Database - dzw
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dzw` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dzw`;

/*Table structure for table `artisanstars` */

DROP TABLE IF EXISTS `artisanstars`;

CREATE TABLE `artisanstars` (
  `starleveid` int(11) NOT NULL AUTO_INCREMENT COMMENT '星级编号',
  `starlevelname` varchar(50) DEFAULT NULL COMMENT '星级名称',
  `weight` int(11) DEFAULT NULL COMMENT '提成权重',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`starleveid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='技工星级表';

/*Data for the table `artisanstars` */

/*Table structure for table `billstype` */

DROP TABLE IF EXISTS `billstype`;

CREATE TABLE `billstype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '业务id',
  `billname` varchar(50) DEFAULT NULL COMMENT '业务类型名',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单据类型表';

/*Data for the table `billstype` */

/*Table structure for table `businesstypew` */

DROP TABLE IF EXISTS `businesstypew`;

CREATE TABLE `businesstypew` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '单据id',
  `businessname` varchar(50) DEFAULT NULL COMMENT '单据名',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='业务类型表';

/*Data for the table `businesstypew` */

/*Table structure for table `carbelong` */

DROP TABLE IF EXISTS `carbelong`;

CREATE TABLE `carbelong` (
  `carid` int(11) NOT NULL AUTO_INCREMENT COMMENT '归属编号',
  `carname` varchar(50) DEFAULT NULL COMMENT '归属名称',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`carid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆归属表';

/*Data for the table `carbelong` */

/*Table structure for table `carbrand` */

DROP TABLE IF EXISTS `carbrand`;

CREATE TABLE `carbrand` (
  `brandid` int(11) NOT NULL AUTO_INCREMENT COMMENT '品牌编号',
  `brandname` varchar(50) DEFAULT NULL COMMENT '品牌名称',
  `initial` varchar(50) DEFAULT NULL COMMENT '首字母',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`brandid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车品牌表';

/*Data for the table `carbrand` */

/*Table structure for table `carbrandinfo` */

DROP TABLE IF EXISTS `carbrandinfo`;

CREATE TABLE `carbrandinfo` (
  `cid` varchar(50) NOT NULL COMMENT '车型id',
  `cno` varchar(50) DEFAULT NULL COMMENT '车品牌编号，连接车品牌表',
  `cname` varchar(50) DEFAULT NULL COMMENT '车型名称',
  `cprice` float DEFAULT NULL COMMENT '参考价格',
  `cyear` float DEFAULT NULL COMMENT '车辆年款',
  `cdischarge` varchar(50) DEFAULT NULL COMMENT '排气量',
  `cdomestic` varchar(50) DEFAULT NULL COMMENT '进口国产',
  `cfuel` varchar(50) DEFAULT NULL COMMENT '燃油标号',
  `cfour` varchar(50) DEFAULT NULL COMMENT '四驱类型',
  `picture` varchar(50) DEFAULT NULL COMMENT '图片',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆型号表';

/*Data for the table `carbrandinfo` */

/*Table structure for table `carinfo` */

DROP TABLE IF EXISTS `carinfo`;

CREATE TABLE `carinfo` (
  `cdlicense` varchar(50) NOT NULL COMMENT '车牌号',
  `cdno` varchar(50) DEFAULT NULL COMMENT '车品牌编号，外键，连接车品牌表',
  `cbiid` varchar(50) DEFAULT NULL COMMENT '车辆型号编号，外键，连接品牌详细表',
  `cddricer` varchar(50) DEFAULT NULL COMMENT '驾驶员',
  `cddriverphone` varchar(50) DEFAULT NULL COMMENT '驾驶员电话',
  `cddriverbirth` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '出生日期',
  `clid` int(11) DEFAULT NULL COMMENT '归属编号，外键，连接归属表',
  `cdlicenseend` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '驾证到期时间',
  `cdframe` varchar(50) DEFAULT NULL COMMENT '车架号',
  `cdengine` varchar(50) DEFAULT NULL COMMENT '发动机号',
  `cdyearprice` float DEFAULT NULL COMMENT '车辆年款',
  `cdmileage` float DEFAULT NULL COMMENT '里程',
  `cdload` varchar(50) DEFAULT NULL COMMENT '载重',
  `cdbuydate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '购买日期',
  `cdgolicense` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '上牌日期',
  `cdcarcheckdate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '车检到期日期',
  `fuelid` int(11) DEFAULT NULL COMMENT '燃油类别编号，外键，连接燃油表',
  `cdsystem` varchar(50) DEFAULT NULL COMMENT '车系',
  `cdcompulsoryinsuranceid` int(11) DEFAULT NULL COMMENT '交强险保险公司，保险公司编号',
  `cdcompulsoryinsurancedate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '交强险到期日期',
  `cdcommerceinsuranceid` int(11) DEFAULT NULL COMMENT '商业险公司，保险公司编号',
  `cdcommerceinsurancedate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '商业险到期时间',
  `cdisinsure` int(11) DEFAULT NULL COMMENT '是否为投保车（0不是，1是）',
  `cdnextmileage` float DEFAULT NULL COMMENT '下次保养里程',
  `cdnextkeep` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '下次保养日期',
  `cno` varchar(50) DEFAULT NULL COMMENT '客户编号，外键，连接客户表',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`cdlicense`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车辆资料表';

/*Data for the table `carinfo` */

/*Table structure for table `cars` */

DROP TABLE IF EXISTS `cars`;

CREATE TABLE `cars` (
  `carid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `platenumber` varchar(50) DEFAULT NULL COMMENT '车牌号',
  `brand` varchar(50) DEFAULT NULL COMMENT '品牌',
  `models` varchar(50) DEFAULT NULL COMMENT '车型',
  `mileage` int(11) DEFAULT NULL COMMENT '当前里程',
  `departid` varchar(50) DEFAULT NULL COMMENT '班组id,外键关联部门表',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`carid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='出勤车辆表';

/*Data for the table `cars` */

/*Table structure for table `contacts` */

DROP TABLE IF EXISTS `contacts`;

CREATE TABLE `contacts` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) DEFAULT NULL COMMENT '联系人',
  `post` varchar(50) DEFAULT NULL COMMENT '职位',
  `mobilephone` varchar(50) DEFAULT NULL COMMENT '手机',
  `telephone` varchar(50) DEFAULT NULL COMMENT '电话',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='厂商联系人表';

/*Data for the table `contacts` */

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `cno` varchar(50) NOT NULL COMMENT '客户编号',
  `ctno` varchar(50) DEFAULT NULL COMMENT '客户分类编号 外键  连接客户分类表',
  `cname` varchar(50) DEFAULT NULL COMMENT '客户名称',
  `cpeople` varchar(50) DEFAULT NULL COMMENT '客户联系人',
  `cphone` varchar(50) DEFAULT NULL COMMENT '手机',
  `caddress` varchar(50) DEFAULT NULL COMMENT '客户地址',
  `cbirthday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '客户生日',
  `cperiod` int(11) DEFAULT NULL COMMENT '账期',
  `climit` float DEFAULT NULL COMMENT '挂账余额',
  `personnelid` int(11) DEFAULT NULL COMMENT '专属顾问编号，外键，连接人员表',
  `cadviserphone` varchar(50) DEFAULT NULL COMMENT '顾问电话',
  `cprovince` varchar(50) DEFAULT NULL COMMENT '省市区',
  `cremark` varchar(50) DEFAULT NULL COMMENT '备注',
  `ctaxes` varchar(50) DEFAULT NULL COMMENT '纳税人识别号',
  `cregistphone` varchar(50) DEFAULT NULL COMMENT '注册电话',
  `cbank` varchar(50) DEFAULT NULL COMMENT '开户银行',
  `cbanknumber` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `cdlicense` varchar(50) DEFAULT NULL COMMENT '车辆编号，外键，连接车辆资料表',
  `cregistaddress` varchar(50) DEFAULT NULL COMMENT '注册地址',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户表';

/*Data for the table `customer` */

/*Table structure for table `customertype` */

DROP TABLE IF EXISTS `customertype`;

CREATE TABLE `customertype` (
  `ctno` varchar(50) NOT NULL COMMENT '客户类别编码',
  `ctname` varchar(50) DEFAULT NULL COMMENT '客户类别名称',
  `ctpricetype` int(11) DEFAULT NULL COMMENT '价格类型编号，外键，连接价格类型表',
  `ctrffective` int(11) DEFAULT NULL COMMENT '有效期限',
  `ctisvip` int(11) DEFAULT NULL COMMENT '是否为会员（0不是，1是）',
  `ctprice` float DEFAULT NULL COMMENT '会费',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`ctno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户分类表';

/*Data for the table `customertype` */

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `departid` varchar(50) NOT NULL COMMENT '部门id',
  `departname` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `parentid` varchar(50) DEFAULT NULL COMMENT '组id，部门父id，关联本身',
  `storeid` varchar(50) DEFAULT NULL COMMENT '门店id',
  `catlog` int(11) DEFAULT NULL COMMENT '0表示目录，1表示功能',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`departid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

/*Data for the table `department` */

/*Table structure for table `dimission` */

DROP TABLE IF EXISTS `dimission`;

CREATE TABLE `dimission` (
  `dimissionid` int(11) NOT NULL AUTO_INCREMENT COMMENT '离职编号',
  `departid` varchar(50) DEFAULT NULL COMMENT '外键，部门表id',
  `staffid` varchar(50) DEFAULT NULL COMMENT '外键，员工编号',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `sex` varchar(50) DEFAULT NULL COMMENT '性别',
  `post` varchar(50) DEFAULT NULL COMMENT '职位',
  `dimissiondate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '离职日期',
  `cause` varchar(50) DEFAULT NULL COMMENT '离职原因',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`dimissionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='离职表';

/*Data for the table `dimission` */

/*Table structure for table `engine` */

DROP TABLE IF EXISTS `engine`;

CREATE TABLE `engine` (
  `motorid` int(11) NOT NULL AUTO_INCREMENT COMMENT '发动机品牌id',
  `motorname` varchar(50) DEFAULT NULL COMMENT '发动机品牌名称',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`motorid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='发动机品牌表';

/*Data for the table `engine` */

/*Table structure for table `fuel` */

DROP TABLE IF EXISTS `fuel`;

CREATE TABLE `fuel` (
  `fuelid` int(11) NOT NULL AUTO_INCREMENT COMMENT '燃油编号',
  `fuelname` varchar(50) DEFAULT NULL COMMENT '燃油名称',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`fuelid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='燃油类型表';

/*Data for the table `fuel` */

/*Table structure for table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
  `gid` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编码',
  `gname` varchar(50) DEFAULT NULL COMMENT '商品名称',
  `storeid` int(11) DEFAULT NULL COMMENT '门店id，外键，连接门店表',
  `applycar` varchar(50) DEFAULT NULL COMMENT '适用车型',
  `unit` varchar(50) DEFAULT NULL COMMENT '数量单位',
  `bigclassify` varchar(50) DEFAULT NULL COMMENT '商品大类',
  `centreclassify` varchar(50) DEFAULT NULL COMMENT '商品中类',
  `smallclassify` varchar(50) DEFAULT NULL COMMENT '商品小类',
  `incomeid` int(11) DEFAULT NULL COMMENT '收入分类，外键，连接收入分类表',
  `vender` varchar(50) DEFAULT NULL COMMENT '原厂副厂',
  `level` varchar(50) DEFAULT NULL COMMENT '商品等级',
  `yieldiy` varchar(50) DEFAULT NULL COMMENT '商品产地',
  `factoryname` varchar(50) DEFAULT NULL COMMENT '厂商名称',
  `coding` varchar(50) DEFAULT NULL COMMENT '原厂编码',
  `barcodes` varchar(50) DEFAULT NULL COMMENT '条形码',
  `specs` varchar(50) DEFAULT NULL COMMENT '包装规格',
  `volume` varchar(50) DEFAULT NULL COMMENT '体积',
  `netweight` int(11) DEFAULT NULL COMMENT '毛重',
  `suttle` int(11) DEFAULT NULL COMMENT '净重',
  `hike` float DEFAULT NULL COMMENT '加价率',
  `exchange` varchar(50) DEFAULT NULL COMMENT '互换码',
  `pricean` varchar(50) DEFAULT NULL COMMENT '售价按',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`gid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';

/*Data for the table `goods` */

/*Table structure for table `goodstype` */

DROP TABLE IF EXISTS `goodstype`;

CREATE TABLE `goodstype` (
  `typeid` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型编号',
  `typename` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `parentid` int(11) DEFAULT NULL COMMENT '父类型id，关联本身 typeid',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`typeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品分类表';

/*Data for the table `goodstype` */

/*Table structure for table `incometype` */

DROP TABLE IF EXISTS `incometype`;

CREATE TABLE `incometype` (
  `incomeid` int(11) NOT NULL AUTO_INCREMENT COMMENT '归属编号',
  `incomename` varchar(50) DEFAULT NULL COMMENT '归属名称',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`incomeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收入分类表';

/*Data for the table `incometype` */

/*Table structure for table `insurance` */

DROP TABLE IF EXISTS `insurance`;

CREATE TABLE `insurance` (
  `insuranceid` int(11) NOT NULL AUTO_INCREMENT COMMENT '燃油编号',
  `insurancename` varchar(50) DEFAULT NULL COMMENT '燃油名称',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`insuranceid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='保险公司表';

/*Data for the table `insurance` */

/*Table structure for table `jointype` */

DROP TABLE IF EXISTS `jointype`;

CREATE TABLE `jointype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `typename` varchar(50) DEFAULT NULL COMMENT '类型名称',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='合资类型表';

/*Data for the table `jointype` */

/*Table structure for table `maintaintype` */

DROP TABLE IF EXISTS `maintaintype`;

CREATE TABLE `maintaintype` (
  `maintainid` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号，编号id',
  `typename` varchar(50) DEFAULT NULL COMMENT '项目类型名',
  `parentid` int(11) DEFAULT NULL COMMENT '父类型id,关联本身id',
  `catlog` int(11) DEFAULT NULL COMMENT '0表示目录，1表示功能',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`maintainid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='维修项目类型表';

/*Data for the table `maintaintype` */

/*Table structure for table `permissions` */

DROP TABLE IF EXISTS `permissions`;

CREATE TABLE `permissions` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限编号',
  `name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '权限中文名称',
  `ename` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '英文名称',
  `catalog` int(11) DEFAULT NULL COMMENT '0表示目录，1表示功能',
  `parentid` int(11) DEFAULT NULL COMMENT '父级编号，关联自身',
  `path` varchar(100) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '权限路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `permissions` */

insert  into `permissions`(`id`,`name`,`ename`,`catalog`,`parentid`,`path`) values (1,'系统管理','sys',0,0,NULL),(2,'初始数据','initdata',0,1,NULL),(3,'系统参数定义','param',0,2,'sys/find.html'),(4,'查询所有','find',1,3,'/param/find'),(5,'根据编号查询','findById',1,3,'/param/findById'),(6,'人事','person',0,0,NULL),(7,'员工资料','dep_recod',0,6,NULL),(8,'岗位定义','post_def',0,7,'person/find.html'),(9,'岗位查询','find',1,8,'/postDef/find'),(10,'岗位根据编号查询','findById',1,9,'/postDef/findById'),(11,'权限管理','permsmanager',0,1,NULL),(12,'权限查询','permsfind',0,11,'/perms/find');

/*Table structure for table `personnel` */

DROP TABLE IF EXISTS `personnel`;

CREATE TABLE `personnel` (
  `personnelid` varchar(50) NOT NULL COMMENT '人员编号',
  `personnelname` varchar(50) NOT NULL COMMENT '人员姓名',
  `enterid` varchar(50) DEFAULT NULL COMMENT '登录账号',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `salt` varchar(50) DEFAULT NULL COMMENT '密码加盐',
  `storeid` int(50) DEFAULT NULL COMMENT '门店id',
  `sex` varchar(50) NOT NULL COMMENT '性别',
  `post` varchar(50) NOT NULL COMMENT '岗位',
  `physicalstate` varchar(50) DEFAULT NULL COMMENT '身体状态',
  `height` varchar(50) DEFAULT NULL COMMENT '身高',
  `phone` varchar(50) NOT NULL COMMENT '手机',
  `card` varchar(50) NOT NULL COMMENT '身份证号',
  `address` varchar(50) DEFAULT NULL COMMENT '现住址地',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `degree` varchar(50) DEFAULT NULL COMMENT '学位',
  `birthplace` varchar(50) DEFAULT NULL COMMENT '籍贯',
  `nation` varchar(50) DEFAULT NULL COMMENT '民族',
  `schooltag` varchar(50) DEFAULT NULL COMMENT '毕业学校',
  `martial` varchar(50) DEFAULT NULL COMMENT '婚姻状态',
  `compile` varchar(50) DEFAULT NULL COMMENT '编制',
  `bankcode` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `emergencyname` varchar(50) DEFAULT NULL COMMENT '紧急联系人',
  `emergencyphone` varchar(50) DEFAULT NULL COMMENT '紧急联系人电话',
  `hiredate` varchar(50) DEFAULT NULL COMMENT '入职日期',
  `applicable` varchar(50) DEFAULT NULL COMMENT '适用到期',
  `borndate` varchar(50) DEFAULT NULL COMMENT '出生日期',
  `startdate` varchar(50) DEFAULT NULL COMMENT '合同开始日',
  `enddate` varchar(50) DEFAULT NULL COMMENT '合同结束日',
  `referrer` varchar(50) DEFAULT NULL COMMENT '推荐人',
  `picture` varchar(50) DEFAULT NULL COMMENT '照片',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`personnelid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `personnel` */

/*Table structure for table `post` */

DROP TABLE IF EXISTS `post`;

CREATE TABLE `post` (
  `postid` int(11) NOT NULL AUTO_INCREMENT COMMENT '岗位编号',
  `postname` varchar(50) DEFAULT NULL COMMENT '岗位名称',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`postid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='岗位表';

/*Data for the table `post` */

/*Table structure for table `pricetype` */

DROP TABLE IF EXISTS `pricetype`;

CREATE TABLE `pricetype` (
  `ptid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `ptname` varchar(50) DEFAULT NULL COMMENT '价格类型名称',
  `ptprice` float DEFAULT NULL COMMENT '价格折扣率',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`ptid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='价格类型表';

/*Data for the table `pricetype` */

/*Table structure for table `project` */

DROP TABLE IF EXISTS `project`;

CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `maintainid` int(11) DEFAULT NULL COMMENT '项目类型，外键，连接（MaintainType）',
  `pnum` varchar(50) DEFAULT NULL COMMENT '项目编码',
  `pname` varchar(50) DEFAULT NULL COMMENT '项目名称',
  `incomeid` int(11) DEFAULT NULL COMMENT '售价，外键，连接收入种类表',
  `standardprice` float DEFAULT NULL COMMENT '标准价',
  `memberprice` float DEFAULT NULL COMMENT '会员价',
  `vipprice` float DEFAULT NULL COMMENT 'VIP价',
  `dealprice` float DEFAULT NULL COMMENT '协议价',
  `claimprice` float DEFAULT NULL COMMENT '索赔价',
  `insuranceprice` float DEFAULT NULL COMMENT '保险价',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='维修项目表';

/*Data for the table `project` */

/*Table structure for table `repair_bill` */

DROP TABLE IF EXISTS `repair_bill`;

CREATE TABLE `repair_bill` (
  `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `number` varchar(50) DEFAULT NULL COMMENT '维修单号',
  `item_type` int(11) DEFAULT NULL COMMENT '单据类型，外键_维修类型表的主键',
  `business_type` int(11) DEFAULT NULL COMMENT '业务类型，外键_业务类型表的主键',
  `working_shift` varchar(20) DEFAULT NULL COMMENT '施工班次',
  `owner_name` varchar(20) DEFAULT NULL COMMENT '车主姓名',
  `plate_number` varchar(20) DEFAULT NULL COMMENT '车牌号',
  `car_type` varchar(20) DEFAULT NULL COMMENT '车型',
  `vin` varchar(20) DEFAULT NULL COMMENT '车架号',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '接车时间',
  `predict_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '预计完工时间',
  `finish_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '完工时间',
  `delays_reason` varchar(50) DEFAULT NULL COMMENT '误工原因',
  `rework_number` int(11) DEFAULT NULL COMMENT '返工数',
  `rework_reason` varchar(50) DEFAULT NULL COMMENT '返工原因',
  `person_liable` varchar(50) DEFAULT NULL COMMENT '责任人',
  `penalty_amount` float DEFAULT NULL COMMENT '处罚金额',
  `engine_number` varchar(20) DEFAULT NULL COMMENT '发动机号',
  `engine_brand` varchar(20) DEFAULT NULL COMMENT '发动机品牌',
  `service_consultant` varchar(20) DEFAULT NULL COMMENT '服务顾问',
  `driver` varchar(20) DEFAULT NULL COMMENT '驾驶员',
  `phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
  `entrance_mileage` float DEFAULT NULL COMMENT '进厂里程',
  `entrance_oil` varchar(20) DEFAULT NULL COMMENT '进厂油量',
  `last_mileage` float DEFAULT NULL COMMENT '上次里程',
  `entrance_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '进厂时间',
  `userid` int(11) DEFAULT NULL COMMENT '接车人，外键用户id',
  `clearing_form` varchar(20) DEFAULT NULL COMMENT '结算方式',
  `corporation` varchar(50) DEFAULT NULL COMMENT '赔款公司',
  `last_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '上次进厂',
  `estimated_amount` float DEFAULT NULL COMMENT '预估金额',
  `remark` varchar(50) DEFAULT NULL COMMENT '接待备注',
  `repairs_statement` varchar(50) DEFAULT NULL COMMENT '保修陈述',
  `remark1` varchar(50) DEFAULT NULL,
  `remark2` varchar(50) DEFAULT NULL,
  `remark3` varchar(50) DEFAULT NULL,
  `remark4` varchar(50) DEFAULT NULL,
  `remark5` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `repair_bill` */

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `roleid` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `rolename` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

/*Data for the table `role` */

/*Table structure for table `roles` */

DROP TABLE IF EXISTS `roles`;

CREATE TABLE `roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色编号',
  `name` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `roles` */

insert  into `roles`(`id`,`name`) values (1,'管理员'),(2,'收银员');

/*Table structure for table `roles_perms` */

DROP TABLE IF EXISTS `roles_perms`;

CREATE TABLE `roles_perms` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `rid` int(11) DEFAULT NULL COMMENT '关联角色编号',
  `pid` int(11) DEFAULT NULL COMMENT '关联权限编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `roles_perms` */

insert  into `roles_perms`(`id`,`rid`,`pid`) values (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,1,5),(6,1,6),(7,1,7),(8,1,8),(9,1,9),(11,1,11),(12,1,12);

/*Table structure for table `settle` */

DROP TABLE IF EXISTS `settle`;

CREATE TABLE `settle` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `total` float DEFAULT NULL COMMENT '订单总金额',
  `tax` varchar(30) DEFAULT NULL COMMENT '税率',
  `taxes` float DEFAULT NULL COMMENT '加税金',
  `wipe` float DEFAULT NULL COMMENT '抹尾数',
  `deduction` float DEFAULT NULL COMMENT '积分抵扣',
  `cash` float DEFAULT NULL COMMENT '现金方式',
  `Bank` float DEFAULT NULL COMMENT '银行卡方式',
  `procedure` float DEFAULT NULL COMMENT '银联手续费',
  `bankclassify` varchar(50) DEFAULT NULL COMMENT '银行卡分类，页面定死字段',
  `Bill` float DEFAULT NULL COMMENT '票据方式',
  `recharge` float DEFAULT NULL COMMENT '重储值方式',
  `password` varchar(20) DEFAULT NULL COMMENT '消费密码',
  `subscription` float DEFAULT NULL COMMENT '冲订金方式',
  `interior` float DEFAULT NULL COMMENT '内部帐方式',
  `interiorType` varchar(20) DEFAULT NULL COMMENT '内部帐分类',
  `voucher` float DEFAULT NULL COMMENT '抵用券方式',
  `voucherType` varchar(20) DEFAULT NULL COMMENT '抵用券分类',
  `voucherNum` varchar(20) DEFAULT NULL COMMENT '抵用券编号',
  `billNum` varchar(20) DEFAULT NULL COMMENT '发票号',
  `BillPrice` float DEFAULT NULL COMMENT '发票金额',
  `Billdate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '开票日期',
  `change` float DEFAULT NULL COMMENT '找零',
  `remark` varchar(30) DEFAULT NULL COMMENT '备用1',
  `remark2` varchar(30) DEFAULT NULL COMMENT '备用2',
  `remark3` varchar(30) DEFAULT NULL COMMENT '备用3',
  `remark4` varchar(30) DEFAULT NULL COMMENT '备用4',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `settle` */

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `staffid` varchar(50) DEFAULT NULL COMMENT '员工编号',
  `personnelid` varchar(50) DEFAULT NULL COMMENT '人员id，连接人员表主键',
  `postid` int(50) DEFAULT NULL COMMENT '岗位id,连接岗位表主键',
  `roleid` int(50) DEFAULT NULL COMMENT '外键，角色id',
  `Remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `Remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `Remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `Remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `Remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `staff` */

/*Table structure for table `store` */

DROP TABLE IF EXISTS `store`;

CREATE TABLE `store` (
  `storeid` int(11) NOT NULL AUTO_INCREMENT COMMENT '门店id',
  `storename` varchar(50) DEFAULT NULL COMMENT '门店名称',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`storeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='门店表';

/*Data for the table `store` */

/*Table structure for table `supplier` */

DROP TABLE IF EXISTS `supplier`;

CREATE TABLE `supplier` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号，编号',
  `sname` varchar(50) DEFAULT NULL COMMENT '单位名称',
  `parentid` int(11) DEFAULT NULL COMMENT '父单位id，关联本身id',
  `catlog` int(11) DEFAULT NULL COMMENT '0表示目录，1表示功能',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供货单位表';

/*Data for the table `supplier` */

/*Table structure for table `supplierparty` */

DROP TABLE IF EXISTS `supplierparty`;

CREATE TABLE `supplierparty` (
  `supid` int(11) NOT NULL AUTO_INCREMENT COMMENT '序号，编号',
  `supcode` varchar(50) DEFAULT NULL COMMENT '厂商代码',
  `supname` varchar(50) DEFAULT NULL COMMENT '厂商名称',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `scase` varchar(50) DEFAULT NULL COMMENT '经营情况',
  `url` varchar(50) DEFAULT NULL COMMENT '网址',
  `bank` varchar(50) DEFAULT NULL COMMENT '开户行',
  `banknum` varchar(50) DEFAULT NULL COMMENT '银行账户',
  `payment` varchar(50) DEFAULT NULL COMMENT '付款方式',
  `level` varchar(50) DEFAULT NULL COMMENT '厂商等级',
  `brand` varchar(50) DEFAULT NULL COMMENT '经营品牌',
  `sid` int(11) DEFAULT NULL COMMENT '厂商类别，外键，连接供货单位表',
  `contacts` varchar(50) DEFAULT NULL COMMENT '联系人',
  `phone` varchar(50) DEFAULT NULL COMMENT '电话',
  `mobile` varchar(50) DEFAULT NULL COMMENT '手机',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `days` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '账期',
  `remark` varchar(50) DEFAULT NULL COMMENT '备注',
  `picture` varchar(50) DEFAULT NULL COMMENT '照片',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`supid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='供货厂商表';

/*Data for the table `supplierparty` */

/*Table structure for table `units` */

DROP TABLE IF EXISTS `units`;

CREATE TABLE `units` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号，序号',
  `unitsname` varchar(50) DEFAULT NULL COMMENT '单位名',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='单位表';

/*Data for the table `units` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，学生编号',
  `username` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '密码',
  `salt` varchar(50) COLLATE utf8mb4_bin DEFAULT NULL COMMENT '盐',
  `rid` int(11) DEFAULT NULL COMMENT '角色编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`salt`,`rid`) values (1,'admin','123','999',NULL),(2,'user1','123','888',NULL);

/*Table structure for table `users_roles` */

DROP TABLE IF EXISTS `users_roles`;

CREATE TABLE `users_roles` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uid` int(11) DEFAULT NULL COMMENT '用户编号',
  `rid` int(11) DEFAULT NULL COMMENT '角色编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

/*Data for the table `users_roles` */

insert  into `users_roles`(`id`,`uid`,`rid`) values (1,1,1),(2,1,2);

/*Table structure for table `vehicletype` */

DROP TABLE IF EXISTS `vehicletype`;

CREATE TABLE `vehicletype` (
  `typeid` varchar(50) NOT NULL COMMENT '车型id',
  `jointypeid` int(11) DEFAULT NULL COMMENT '合资类型，外键，关联合资类型表',
  `typename` varchar(50) DEFAULT NULL COMMENT '车型名称',
  `referenceprice` float DEFAULT NULL COMMENT '参考价格',
  `caryear` varchar(50) DEFAULT NULL COMMENT '车辆年款',
  `power` int(11) DEFAULT NULL COMMENT '功率',
  `mark` int(11) DEFAULT NULL COMMENT '燃油标号',
  `load` int(11) DEFAULT NULL COMMENT '载重',
  `motorid` int(11) DEFAULT NULL COMMENT '发动机品牌，外键，关联发动机品牌表',
  `brandid` int(11) DEFAULT NULL COMMENT '车辆品牌，外键，关联车辆品牌表',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`typeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='车型表';

/*Data for the table `vehicletype` */

/*Table structure for table `vip` */

DROP TABLE IF EXISTS `vip`;

CREATE TABLE `vip` (
  `vno` varchar(50) NOT NULL COMMENT '会员卡号',
  `vjoindate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '入会日期',
  `venddate` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' COMMENT '会员到期',
  `cno` varchar(50) DEFAULT NULL COMMENT '客户编号',
  `levelid` int(11) DEFAULT NULL COMMENT '会员等级编号',
  `currentjifen` int(11) DEFAULT NULL COMMENT '当前积分',
  `summoney` double DEFAULT NULL COMMENT '累计消费金额',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  `money` double DEFAULT NULL COMMENT '账户余额',
  PRIMARY KEY (`vno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员表';

/*Data for the table `vip` */

/*Table structure for table `viplevel` */

DROP TABLE IF EXISTS `viplevel`;

CREATE TABLE `viplevel` (
  `levelid` int(11) NOT NULL AUTO_INCREMENT COMMENT '等级id',
  `viplevel` varchar(50) DEFAULT NULL COMMENT '等级名称',
  `startjifen` int(11) DEFAULT NULL COMMENT '开始积分',
  `discount` float DEFAULT NULL COMMENT '打折率',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`levelid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员等级表';

/*Data for the table `viplevel` */

/*Table structure for table `workman` */

DROP TABLE IF EXISTS `workman`;

CREATE TABLE `workman` (
  `workid` varchar(11) NOT NULL COMMENT '技工编号',
  `stars` varchar(50) DEFAULT NULL COMMENT '星级',
  `craft` varchar(50) DEFAULT NULL COMMENT '工种',
  `brand` varchar(50) DEFAULT NULL COMMENT '维修品牌',
  `personnelid` varchar(50) DEFAULT NULL COMMENT '外键，连接人员表主键',
  `remark1` varchar(50) DEFAULT NULL COMMENT '备用字段1',
  `remark2` varchar(50) DEFAULT NULL COMMENT '备用字段2',
  `remark3` varchar(50) DEFAULT NULL COMMENT '备用字段3',
  `remark4` varchar(50) DEFAULT NULL COMMENT '备用字段4',
  `remark5` varchar(50) DEFAULT NULL COMMENT '备用字段5',
  PRIMARY KEY (`workid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='技工表';

/*Data for the table `workman` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
