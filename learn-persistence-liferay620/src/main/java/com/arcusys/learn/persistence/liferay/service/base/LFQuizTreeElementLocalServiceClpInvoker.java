package com.arcusys.learn.persistence.liferay.service.base;

import com.arcusys.learn.persistence.liferay.service.LFQuizTreeElementLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class LFQuizTreeElementLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName216;
    private String[] _methodParameterTypes216;
    private String _methodName217;
    private String[] _methodParameterTypes217;
    private String _methodName222;
    private String[] _methodParameterTypes222;
    private String _methodName223;
    private String[] _methodParameterTypes223;
    private String _methodName224;
    private String[] _methodParameterTypes224;
    private String _methodName225;
    private String[] _methodParameterTypes225;
    private String _methodName226;
    private String[] _methodParameterTypes226;

    public LFQuizTreeElementLocalServiceClpInvoker() {
        _methodName0 = "addLFQuizTreeElement";

        _methodParameterTypes0 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFQuizTreeElement"
            };

        _methodName1 = "createLFQuizTreeElement";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteLFQuizTreeElement";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteLFQuizTreeElement";

        _methodParameterTypes3 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFQuizTreeElement"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchLFQuizTreeElement";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getLFQuizTreeElement";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getLFQuizTreeElements";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getLFQuizTreeElementsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateLFQuizTreeElement";

        _methodParameterTypes15 = new String[] {
                "com.arcusys.learn.persistence.liferay.model.LFQuizTreeElement"
            };

        _methodName216 = "getBeanIdentifier";

        _methodParameterTypes216 = new String[] {  };

        _methodName217 = "setBeanIdentifier";

        _methodParameterTypes217 = new String[] { "java.lang.String" };

        _methodName222 = "createLFQuizTreeElement";

        _methodParameterTypes222 = new String[] {  };

        _methodName223 = "findByQuizID";

        _methodParameterTypes223 = new String[] { "java.lang.Integer" };

        _methodName224 = "findByQuizAndElementID";

        _methodParameterTypes224 = new String[] {
                "java.lang.Integer", "java.lang.String"
            };

        _methodName225 = "findByQuizAndParentID";

        _methodParameterTypes225 = new String[] {
                "java.lang.Integer", "java.lang.String"
            };

        _methodName226 = "removeAll";

        _methodParameterTypes226 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.addLFQuizTreeElement((com.arcusys.learn.persistence.liferay.model.LFQuizTreeElement) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.createLFQuizTreeElement(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.deleteLFQuizTreeElement(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.deleteLFQuizTreeElement((com.arcusys.learn.persistence.liferay.model.LFQuizTreeElement) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.fetchLFQuizTreeElement(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.getLFQuizTreeElement(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.getLFQuizTreeElements(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.getLFQuizTreeElementsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.updateLFQuizTreeElement((com.arcusys.learn.persistence.liferay.model.LFQuizTreeElement) arguments[0]);
        }

        if (_methodName216.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes216, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName217.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes217, parameterTypes)) {
            LFQuizTreeElementLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName222.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes222, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.createLFQuizTreeElement();
        }

        if (_methodName223.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes223, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.findByQuizID((java.lang.Integer) arguments[0]);
        }

        if (_methodName224.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes224, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.findByQuizAndElementID((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1]);
        }

        if (_methodName225.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes225, parameterTypes)) {
            return LFQuizTreeElementLocalServiceUtil.findByQuizAndParentID((java.lang.Integer) arguments[0],
                (java.lang.String) arguments[1]);
        }

        if (_methodName226.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes226, parameterTypes)) {
            LFQuizTreeElementLocalServiceUtil.removeAll();

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
