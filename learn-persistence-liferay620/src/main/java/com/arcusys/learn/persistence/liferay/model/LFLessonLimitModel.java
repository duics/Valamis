package com.arcusys.learn.persistence.liferay.model;

import com.arcusys.learn.persistence.liferay.service.persistence.LFLessonLimitPK;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the LFLessonLimit service. Represents a row in the &quot;Learn_LFLessonLimit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.arcusys.learn.persistence.liferay.model.impl.LFLessonLimitModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.arcusys.learn.persistence.liferay.model.impl.LFLessonLimitImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFLessonLimit
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFLessonLimitImpl
 * @see com.arcusys.learn.persistence.liferay.model.impl.LFLessonLimitModelImpl
 * @generated
 */
public interface LFLessonLimitModel extends BaseModel<LFLessonLimit> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a l f lesson limit model instance should use the {@link LFLessonLimit} interface instead.
     */

    /**
     * Returns the primary key of this l f lesson limit.
     *
     * @return the primary key of this l f lesson limit
     */
    public LFLessonLimitPK getPrimaryKey();

    /**
     * Sets the primary key of this l f lesson limit.
     *
     * @param primaryKey the primary key of this l f lesson limit
     */
    public void setPrimaryKey(LFLessonLimitPK primaryKey);

    /**
     * Returns the item i d of this l f lesson limit.
     *
     * @return the item i d of this l f lesson limit
     */
    public Long getItemID();

    /**
     * Sets the item i d of this l f lesson limit.
     *
     * @param itemID the item i d of this l f lesson limit
     */
    public void setItemID(Long itemID);

    /**
     * Returns the item type of this l f lesson limit.
     *
     * @return the item type of this l f lesson limit
     */
    @AutoEscape
    public String getItemType();

    /**
     * Sets the item type of this l f lesson limit.
     *
     * @param itemType the item type of this l f lesson limit
     */
    public void setItemType(String itemType);

    /**
     * Returns the passing limit of this l f lesson limit.
     *
     * @return the passing limit of this l f lesson limit
     */
    public Integer getPassingLimit();

    /**
     * Sets the passing limit of this l f lesson limit.
     *
     * @param passingLimit the passing limit of this l f lesson limit
     */
    public void setPassingLimit(Integer passingLimit);

    /**
     * Returns the rerun interval of this l f lesson limit.
     *
     * @return the rerun interval of this l f lesson limit
     */
    public Integer getRerunInterval();

    /**
     * Sets the rerun interval of this l f lesson limit.
     *
     * @param rerunInterval the rerun interval of this l f lesson limit
     */
    public void setRerunInterval(Integer rerunInterval);

    /**
     * Returns the rerun interval type of this l f lesson limit.
     *
     * @return the rerun interval type of this l f lesson limit
     */
    @AutoEscape
    public String getRerunIntervalType();

    /**
     * Sets the rerun interval type of this l f lesson limit.
     *
     * @param rerunIntervalType the rerun interval type of this l f lesson limit
     */
    public void setRerunIntervalType(String rerunIntervalType);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(LFLessonLimit lfLessonLimit);

    @Override
    public int hashCode();

    @Override
    public CacheModel<LFLessonLimit> toCacheModel();

    @Override
    public LFLessonLimit toEscapedModel();

    @Override
    public LFLessonLimit toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}