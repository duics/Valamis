package com.arcusys.learn.persistence.liferay.service.persistence;

import com.arcusys.learn.persistence.liferay.model.LFTincanPackage;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the l f tincan package service. This utility wraps {@link LFTincanPackagePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LFTincanPackagePersistence
 * @see LFTincanPackagePersistenceImpl
 * @generated
 */
public class LFTincanPackageUtil {
    private static LFTincanPackagePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(LFTincanPackage lfTincanPackage) {
        getPersistence().clearCache(lfTincanPackage);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<LFTincanPackage> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<LFTincanPackage> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<LFTincanPackage> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static LFTincanPackage update(LFTincanPackage lfTincanPackage)
        throws SystemException {
        return getPersistence().update(lfTincanPackage);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static LFTincanPackage update(LFTincanPackage lfTincanPackage,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(lfTincanPackage, serviceContext);
    }

    /**
    * Returns the l f tincan package where assetRefID = &#63; or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException} if it could not be found.
    *
    * @param assetRefID the asset ref i d
    * @return the matching l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage findByRefID(
        java.lang.Long assetRefID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByRefID(assetRefID);
    }

    /**
    * Returns the l f tincan package where assetRefID = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param assetRefID the asset ref i d
    * @return the matching l f tincan package, or <code>null</code> if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage fetchByRefID(
        java.lang.Long assetRefID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByRefID(assetRefID);
    }

    /**
    * Returns the l f tincan package where assetRefID = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param assetRefID the asset ref i d
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching l f tincan package, or <code>null</code> if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage fetchByRefID(
        java.lang.Long assetRefID, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByRefID(assetRefID, retrieveFromCache);
    }

    /**
    * Removes the l f tincan package where assetRefID = &#63; from the database.
    *
    * @param assetRefID the asset ref i d
    * @return the l f tincan package that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage removeByRefID(
        java.lang.Long assetRefID)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByRefID(assetRefID);
    }

    /**
    * Returns the number of l f tincan packages where assetRefID = &#63;.
    *
    * @param assetRefID the asset ref i d
    * @return the number of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByRefID(java.lang.Long assetRefID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByRefID(assetRefID);
    }

    /**
    * Returns all the l f tincan packages where title LIKE &#63; and courseID = &#63;.
    *
    * @param title the title
    * @param courseID the course i d
    * @return the matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByTitleAndCourseID(
        java.lang.String title, java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByTitleAndCourseID(title, courseID);
    }

    /**
    * Returns a range of all the l f tincan packages where title LIKE &#63; and courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param title the title
    * @param courseID the course i d
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @return the range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByTitleAndCourseID(
        java.lang.String title, java.lang.Integer courseID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByTitleAndCourseID(title, courseID, start, end);
    }

    /**
    * Returns an ordered range of all the l f tincan packages where title LIKE &#63; and courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param title the title
    * @param courseID the course i d
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByTitleAndCourseID(
        java.lang.String title, java.lang.Integer courseID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByTitleAndCourseID(title, courseID, start, end,
            orderByComparator);
    }

    /**
    * Returns the first l f tincan package in the ordered set where title LIKE &#63; and courseID = &#63;.
    *
    * @param title the title
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage findByTitleAndCourseID_First(
        java.lang.String title, java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByTitleAndCourseID_First(title, courseID,
            orderByComparator);
    }

    /**
    * Returns the first l f tincan package in the ordered set where title LIKE &#63; and courseID = &#63;.
    *
    * @param title the title
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan package, or <code>null</code> if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage fetchByTitleAndCourseID_First(
        java.lang.String title, java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByTitleAndCourseID_First(title, courseID,
            orderByComparator);
    }

    /**
    * Returns the last l f tincan package in the ordered set where title LIKE &#63; and courseID = &#63;.
    *
    * @param title the title
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage findByTitleAndCourseID_Last(
        java.lang.String title, java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByTitleAndCourseID_Last(title, courseID,
            orderByComparator);
    }

    /**
    * Returns the last l f tincan package in the ordered set where title LIKE &#63; and courseID = &#63;.
    *
    * @param title the title
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan package, or <code>null</code> if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage fetchByTitleAndCourseID_Last(
        java.lang.String title, java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByTitleAndCourseID_Last(title, courseID,
            orderByComparator);
    }

    /**
    * Returns the l f tincan packages before and after the current l f tincan package in the ordered set where title LIKE &#63; and courseID = &#63;.
    *
    * @param id the primary key of the current l f tincan package
    * @param title the title
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a l f tincan package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage[] findByTitleAndCourseID_PrevAndNext(
        long id, java.lang.String title, java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByTitleAndCourseID_PrevAndNext(id, title, courseID,
            orderByComparator);
    }

    /**
    * Returns all the l f tincan packages where title LIKE &#63; and courseID = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param title the title
    * @param courseIDs the course i ds
    * @return the matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByTitleAndCourseID(
        java.lang.String title, java.lang.Integer[] courseIDs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByTitleAndCourseID(title, courseIDs);
    }

    /**
    * Returns a range of all the l f tincan packages where title LIKE &#63; and courseID = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param title the title
    * @param courseIDs the course i ds
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @return the range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByTitleAndCourseID(
        java.lang.String title, java.lang.Integer[] courseIDs, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByTitleAndCourseID(title, courseIDs, start, end);
    }

    /**
    * Returns an ordered range of all the l f tincan packages where title LIKE &#63; and courseID = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param title the title
    * @param courseIDs the course i ds
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByTitleAndCourseID(
        java.lang.String title, java.lang.Integer[] courseIDs, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByTitleAndCourseID(title, courseIDs, start, end,
            orderByComparator);
    }

    /**
    * Removes all the l f tincan packages where title LIKE &#63; and courseID = &#63; from the database.
    *
    * @param title the title
    * @param courseID the course i d
    * @throws SystemException if a system exception occurred
    */
    public static void removeByTitleAndCourseID(java.lang.String title,
        java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByTitleAndCourseID(title, courseID);
    }

    /**
    * Returns the number of l f tincan packages where title LIKE &#63; and courseID = &#63;.
    *
    * @param title the title
    * @param courseID the course i d
    * @return the number of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByTitleAndCourseID(java.lang.String title,
        java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByTitleAndCourseID(title, courseID);
    }

    /**
    * Returns the number of l f tincan packages where title LIKE &#63; and courseID = any &#63;.
    *
    * @param title the title
    * @param courseIDs the course i ds
    * @return the number of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByTitleAndCourseID(java.lang.String title,
        java.lang.Integer[] courseIDs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByTitleAndCourseID(title, courseIDs);
    }

    /**
    * Returns all the l f tincan packages where courseID = &#63;.
    *
    * @param courseID the course i d
    * @return the matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByInstance(
        java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance(courseID);
    }

    /**
    * Returns a range of all the l f tincan packages where courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param courseID the course i d
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @return the range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByInstance(
        java.lang.Integer courseID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance(courseID, start, end);
    }

    /**
    * Returns an ordered range of all the l f tincan packages where courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param courseID the course i d
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByInstance(
        java.lang.Integer courseID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInstance(courseID, start, end, orderByComparator);
    }

    /**
    * Returns the first l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage findByInstance_First(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance_First(courseID, orderByComparator);
    }

    /**
    * Returns the first l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan package, or <code>null</code> if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage fetchByInstance_First(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByInstance_First(courseID, orderByComparator);
    }

    /**
    * Returns the last l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage findByInstance_Last(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance_Last(courseID, orderByComparator);
    }

    /**
    * Returns the last l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan package, or <code>null</code> if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage fetchByInstance_Last(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByInstance_Last(courseID, orderByComparator);
    }

    /**
    * Returns the l f tincan packages before and after the current l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param id the primary key of the current l f tincan package
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a l f tincan package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage[] findByInstance_PrevAndNext(
        long id, java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInstance_PrevAndNext(id, courseID, orderByComparator);
    }

    /**
    * Returns all the l f tincan packages where courseID = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param courseIDs the course i ds
    * @return the matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByInstance(
        java.lang.Integer[] courseIDs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance(courseIDs);
    }

    /**
    * Returns a range of all the l f tincan packages where courseID = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param courseIDs the course i ds
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @return the range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByInstance(
        java.lang.Integer[] courseIDs, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByInstance(courseIDs, start, end);
    }

    /**
    * Returns an ordered range of all the l f tincan packages where courseID = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param courseIDs the course i ds
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByInstance(
        java.lang.Integer[] courseIDs, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByInstance(courseIDs, start, end, orderByComparator);
    }

    /**
    * Removes all the l f tincan packages where courseID = &#63; from the database.
    *
    * @param courseID the course i d
    * @throws SystemException if a system exception occurred
    */
    public static void removeByInstance(java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByInstance(courseID);
    }

    /**
    * Returns the number of l f tincan packages where courseID = &#63;.
    *
    * @param courseID the course i d
    * @return the number of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByInstance(java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByInstance(courseID);
    }

    /**
    * Returns the number of l f tincan packages where courseID = any &#63;.
    *
    * @param courseIDs the course i ds
    * @return the number of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByInstance(java.lang.Integer[] courseIDs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByInstance(courseIDs);
    }

    /**
    * Returns all the l f tincan packages where courseID = &#63;.
    *
    * @param courseID the course i d
    * @return the matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByCourseID(
        java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCourseID(courseID);
    }

    /**
    * Returns a range of all the l f tincan packages where courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param courseID the course i d
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @return the range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByCourseID(
        java.lang.Integer courseID, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCourseID(courseID, start, end);
    }

    /**
    * Returns an ordered range of all the l f tincan packages where courseID = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param courseID the course i d
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findByCourseID(
        java.lang.Integer courseID, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCourseID(courseID, start, end, orderByComparator);
    }

    /**
    * Returns the first l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage findByCourseID_First(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCourseID_First(courseID, orderByComparator);
    }

    /**
    * Returns the first l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching l f tincan package, or <code>null</code> if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage fetchByCourseID_First(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCourseID_First(courseID, orderByComparator);
    }

    /**
    * Returns the last l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage findByCourseID_Last(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCourseID_Last(courseID, orderByComparator);
    }

    /**
    * Returns the last l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching l f tincan package, or <code>null</code> if a matching l f tincan package could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage fetchByCourseID_Last(
        java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByCourseID_Last(courseID, orderByComparator);
    }

    /**
    * Returns the l f tincan packages before and after the current l f tincan package in the ordered set where courseID = &#63;.
    *
    * @param id the primary key of the current l f tincan package
    * @param courseID the course i d
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a l f tincan package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage[] findByCourseID_PrevAndNext(
        long id, java.lang.Integer courseID,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCourseID_PrevAndNext(id, courseID, orderByComparator);
    }

    /**
    * Removes all the l f tincan packages where courseID = &#63; from the database.
    *
    * @param courseID the course i d
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCourseID(java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCourseID(courseID);
    }

    /**
    * Returns the number of l f tincan packages where courseID = &#63;.
    *
    * @param courseID the course i d
    * @return the number of matching l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static int countByCourseID(java.lang.Integer courseID)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCourseID(courseID);
    }

    /**
    * Caches the l f tincan package in the entity cache if it is enabled.
    *
    * @param lfTincanPackage the l f tincan package
    */
    public static void cacheResult(
        com.arcusys.learn.persistence.liferay.model.LFTincanPackage lfTincanPackage) {
        getPersistence().cacheResult(lfTincanPackage);
    }

    /**
    * Caches the l f tincan packages in the entity cache if it is enabled.
    *
    * @param lfTincanPackages the l f tincan packages
    */
    public static void cacheResult(
        java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> lfTincanPackages) {
        getPersistence().cacheResult(lfTincanPackages);
    }

    /**
    * Creates a new l f tincan package with the primary key. Does not add the l f tincan package to the database.
    *
    * @param id the primary key for the new l f tincan package
    * @return the new l f tincan package
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage create(
        long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the l f tincan package with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the l f tincan package
    * @return the l f tincan package that was removed
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a l f tincan package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage remove(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage updateImpl(
        com.arcusys.learn.persistence.liferay.model.LFTincanPackage lfTincanPackage)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(lfTincanPackage);
    }

    /**
    * Returns the l f tincan package with the primary key or throws a {@link com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException} if it could not be found.
    *
    * @param id the primary key of the l f tincan package
    * @return the l f tincan package
    * @throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException if a l f tincan package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage findByPrimaryKey(
        long id)
        throws com.arcusys.learn.persistence.liferay.NoSuchLFTincanPackageException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the l f tincan package with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the l f tincan package
    * @return the l f tincan package, or <code>null</code> if a l f tincan package with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.arcusys.learn.persistence.liferay.model.LFTincanPackage fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the l f tincan packages.
    *
    * @return the l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the l f tincan packages.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @return the range of l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the l f tincan packages.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.arcusys.learn.persistence.liferay.model.impl.LFTincanPackageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of l f tincan packages
    * @param end the upper bound of the range of l f tincan packages (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.arcusys.learn.persistence.liferay.model.LFTincanPackage> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the l f tincan packages from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of l f tincan packages.
    *
    * @return the number of l f tincan packages
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LFTincanPackagePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LFTincanPackagePersistence) PortletBeanLocatorUtil.locate(com.arcusys.learn.persistence.liferay.service.ClpSerializer.getServletContextName(),
                    LFTincanPackagePersistence.class.getName());

            ReferenceRegistry.registerReference(LFTincanPackageUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LFTincanPackagePersistence persistence) {
    }
}
