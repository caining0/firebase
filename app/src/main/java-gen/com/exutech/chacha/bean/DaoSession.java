package com.exutech.chacha.bean;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.exutech.chacha.bean.FriendlyMessage;

import com.exutech.chacha.bean.FriendlyMessageDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig friendlyMessageDaoConfig;

    private final FriendlyMessageDao friendlyMessageDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        friendlyMessageDaoConfig = daoConfigMap.get(FriendlyMessageDao.class).clone();
        friendlyMessageDaoConfig.initIdentityScope(type);

        friendlyMessageDao = new FriendlyMessageDao(friendlyMessageDaoConfig, this);

        registerDao(FriendlyMessage.class, friendlyMessageDao);
    }
    
    public void clear() {
        friendlyMessageDaoConfig.getIdentityScope().clear();
    }

    public FriendlyMessageDao getFriendlyMessageDao() {
        return friendlyMessageDao;
    }

}