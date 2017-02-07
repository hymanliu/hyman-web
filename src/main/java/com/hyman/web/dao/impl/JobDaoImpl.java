package com.hyman.web.dao.impl;

import org.springframework.stereotype.Repository;

import com.hyman.web.bean.Job;
import com.hyman.web.bean.key.Jobkey;
import com.hyman.web.dao.JobDao;


@Repository
public class JobDaoImpl extends BaseDaoImpl<Job, Jobkey> implements JobDao {

}
