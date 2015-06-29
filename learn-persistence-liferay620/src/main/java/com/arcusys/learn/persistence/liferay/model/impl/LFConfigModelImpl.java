package com.arcusys.learn.persistence.liferay.model.impl;

import com.arcusys.learn.persistence.liferay.model.LFConfig;
import com.arcusys.learn.persistence.liferay.model.LFConfigModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the LFConfig service. Represents a row in the &quot;Learn_LFConfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.arcusys.learn.persistence.liferay.model.LFConfigModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LFConfigImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFConfigImpl
 * @see com.arcusys.learn.persistence.liferay.model.LFConfig
 * @see com.arcusys.learn.persistence.liferay.model.LFConfigModel
 * @generated
 */
public class LFConfigModelImpl extends BaseModelImpl<LFConfig>
    implements LFConfigModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a l f config model instance should use the {@link com.arcusys.learn.persistence.liferay.model.LFConfig} interface instead.
     */
    public static final String TABLE_NAME = "Learn_LFConfig";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "dataKey", Types.VARCHAR },
            { "dataValue", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table Learn_LFConfig (id_ LONG not null primary key,dataKey VARCHAR(512) null,dataValue VARCHAR(512) null)";
    public static final String TABLE_SQL_DROP = "drop table Learn_LFConfig";
    public static final String ORDER_BY_JPQL = " ORDER BY lfConfig.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY Learn_LFConfig.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFConfig"),
            false);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.arcusys.learn.persistence.liferay.model.LFConfig"),
            false);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.arcusys.learn.persistence.liferay.model.LFConfig"),
            true);
    public static long DATAKEY_COLUMN_BITMASK = 1L;
    public static long ID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.arcusys.learn.persistence.liferay.model.LFConfig"));
    private static ClassLoader _classLoader = LFConfig.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            LFConfig.class
        };
    private long _id;
    private String _dataKey;
    private String _originalDataKey;
    private String _dataValue;
    private long _columnBitmask;
    private LFConfig _escapedModel;

    public LFConfigModelImpl() {
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return LFConfig.class;
    }

    @Override
    public String getModelClassName() {
        return LFConfig.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("dataKey", getDataKey());
        attributes.put("dataValue", getDataValue());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String dataKey = (String) attributes.get("dataKey");

        if (dataKey != null) {
            setDataKey(dataKey);
        }

        String dataValue = (String) attributes.get("dataValue");

        if (dataValue != null) {
            setDataValue(dataValue);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
    }

    @Override
    public String getDataKey() {
        if (_dataKey == null) {
            return StringPool.BLANK;
        } else {
            return _dataKey;
        }
    }

    @Override
    public void setDataKey(String dataKey) {
        _columnBitmask |= DATAKEY_COLUMN_BITMASK;

        if (_originalDataKey == null) {
            _originalDataKey = _dataKey;
        }

        _dataKey = dataKey;
    }

    public String getOriginalDataKey() {
        return GetterUtil.getString(_originalDataKey);
    }

    @Override
    public String getDataValue() {
        if (_dataValue == null) {
            return StringPool.BLANK;
        } else {
            return _dataValue;
        }
    }

    @Override
    public void setDataValue(String dataValue) {
        _dataValue = dataValue;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            LFConfig.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public LFConfig toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (LFConfig) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LFConfigImpl lfConfigImpl = new LFConfigImpl();

        lfConfigImpl.setId(getId());
        lfConfigImpl.setDataKey(getDataKey());
        lfConfigImpl.setDataValue(getDataValue());

        lfConfigImpl.resetOriginalValues();

        return lfConfigImpl;
    }

    @Override
    public int compareTo(LFConfig lfConfig) {
        long primaryKey = lfConfig.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LFConfig)) {
            return false;
        }

        LFConfig lfConfig = (LFConfig) obj;

        long primaryKey = lfConfig.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        LFConfigModelImpl lfConfigModelImpl = this;

        lfConfigModelImpl._originalDataKey = lfConfigModelImpl._dataKey;

        lfConfigModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<LFConfig> toCacheModel() {
        LFConfigCacheModel lfConfigCacheModel = new LFConfigCacheModel();

        lfConfigCacheModel.id = getId();

        lfConfigCacheModel.dataKey = getDataKey();

        String dataKey = lfConfigCacheModel.dataKey;

        if ((dataKey != null) && (dataKey.length() == 0)) {
            lfConfigCacheModel.dataKey = null;
        }

        lfConfigCacheModel.dataValue = getDataValue();

        String dataValue = lfConfigCacheModel.dataValue;

        if ((dataValue != null) && (dataValue.length() == 0)) {
            lfConfigCacheModel.dataValue = null;
        }

        return lfConfigCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", dataKey=");
        sb.append(getDataKey());
        sb.append(", dataValue=");
        sb.append(getDataValue());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.arcusys.learn.persistence.liferay.model.LFConfig");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataKey</column-name><column-value><![CDATA[");
        sb.append(getDataKey());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>dataValue</column-name><column-value><![CDATA[");
        sb.append(getDataValue());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
