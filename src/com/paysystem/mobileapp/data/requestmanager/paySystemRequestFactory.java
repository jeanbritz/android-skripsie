package com.paysystem.mobileapp.data.requestmanager;

import com.foxykeep.datadroid.requestmanager.Request;
import com.paysystem.mobileapp.data.operation.AuthenticationOperation;
import com.paysystem.mobileapp.data.operation.ClaimListOperation;

/**
 * Class used to create the {@link Request}s.
 *
 * @author Foxykeep
 */
public final class paySystemRequestFactory {

    // Request types
    public static final int REQUEST_TYPE_CLAIM_LIST = 0;
    public static final int REQUEST_TYPE_TRANSACTION_LIST = 1;
    //public static final int REQUEST_TYPE_CITY_LIST = 1;
   // public static final int REQUEST_TYPE_CITY_LIST_2 = 2;
    public static final int REQUEST_TYPE_AUTHENTICATION = 3;
    public static final int REQUEST_TYPE_CUSTOM_REQUEST_EXCEPTION = 4;

   // public static final int REQUEST_TYPE_CRUD_SYNC_PHONE_LIST = 10;
   // public static final int REQUEST_TYPE_CRUD_SYNC_PHONE_DELETE = 11;
   // public static final int REQUEST_TYPE_CRUD_SYNC_PHONE_ADD = 12;
   // public static final int REQUEST_TYPE_CRUD_SYNC_PHONE_EDIT = 13;

  //  public static final int REQUEST_TYPE_RSS_FEED = 20;

   // public static final int REQUEST_TYPE_COMPUTE_SQUARE = 30;

    // Response data
   // public static final String BUNDLE_EXTRA_CITY_LIST =
   //         "com.foxykeep.datadroidpoc.extra.cityList";
   // public static final String BUNDLE_EXTRA_PHONE_LIST =
   //         "com.foxykeep.datadroidpoc.extra.phoneList";
    public static final String BUNDLE_EXTRA_AUTHENTICATION_RESULT =
           "com.paysystem.mobileapp.extra.authenticationResult";
   // public static final String BUNDLE_EXTRA_PHONE_DELETE_DATA =
   //         "com.foxykeep.datadroidpoc.extra.phoneDeleteData";
   // public static final String BUNDLE_EXTRA_PHONE_ADD_EDIT_DATA =
   //         "com.foxykeep.datadroidpoc.extra.phoneAddEditData";
   // public static final String BUNDLE_EXTRA_RSS_FEED_DATA =
   //         "com.foxykeep.datadroidpoc.extra.rssFeed";
  //  public static final String BUNDLE_EXTRA_SQUARE =
   //         "com.foxykeep.datadroidpoc.extra.square";
   // public static final String BUNDLE_EXTRA_ERROR_MESSAGE =
   //         "com.foxykeep.datadroidpoc.extra.errorMessage";

    private paySystemRequestFactory() {
        // no public constructor
    }

    /**
     * Create the request to get the list of persons and save it in the database.
     *
     * @param returnFormat 0 for XML, 1 for JSON.
     * @return The request.
     */
    public static Request getClaimListRequest() {
        Request request = new Request(REQUEST_TYPE_CLAIM_LIST);
        return request;
    }
    
    public static Request getTransactionListRequest() {
    	Request request = new Request(REQUEST_TYPE_TRANSACTION_LIST);
		return request;
    }
    
    /**
     * Create the request to get the list of cities and save it in the memory provider.
     *
     * @return The request.
     */
   /* public static Request getCityListRequest() {
        Request request = new Request(REQUEST_TYPE_CITY_LIST);
        request.setMemoryCacheEnabled(true);
        return request;
    }*/

    /**
     * Create the request to get the list of cities and save it in the memory provider.
     *
     * @return The request.
     */
    /*public static Request getCityList2Request() {
        Request request = new Request(REQUEST_TYPE_CITY_LIST_2);
        request.setMemoryCacheEnabled(true);
        return request;
    }*/

    /**
     * Create the request to the authentication webservice.
     * <p>
     * The returned message will be either a greeting if the authentication worked or a message
     * telling you to authenticate otherwise.
     *
     * @param withAuthenticate Whether the request will be made with the authentication data or not.
     * @return The request.
     */
    public static Request authenticationRequest(boolean withAuthenticate) {
        Request request = new Request(REQUEST_TYPE_AUTHENTICATION);
        request.put(AuthenticationOperation.PARAM_WITH_AUTHENTICATE, withAuthenticate);
        request.setMemoryCacheEnabled(true);
        return request;
    }

    /**
     * Create the request to get the list of cities and save it in the memory provider.
     * <p>
     * Depending on the withException parameter, a {@link CustomRequestException} will be triggered
     * or not.
     *
     * @param withException Whether to trigger the {@link CustomRequestException} or not.
     * @return The request.
     */
  /*  public static Request getCityListExceptionRequest(boolean withException) {
        Request request = new Request(REQUEST_TYPE_CUSTOM_REQUEST_EXCEPTION);
        request.put(CustomRequestExceptionOperation.PARAM_WITH_EXCEPTION, withException);
        request.setMemoryCacheEnabled(true);
        return request;
    }*/

    /**
     * Create the request to get the list of phones synchronously and save it in the memory.
     *
     * @param userId the id of the user (generated by the application).
     * @return The request.
     */
   /* public static Request getSyncPhoneListRequest(String userId) {
        Request request = new Request(REQUEST_TYPE_CRUD_SYNC_PHONE_LIST);
        request.setMemoryCacheEnabled(true);
        request.put(CrudSyncPhoneListOperation.PARAM_USER_ID, userId);
        return request;
    }*/

    /**
     * Create the request to delete a phone synchronously.
     *
     * @param userId the id of the user (generated by the application).
     * @param phoneIdList the list of phone ids to delete (comma separated).
     * @return The request.
     */
   /* public static Request deleteSyncPhonesRequest(String userId, String phoneIdList) {
        Request request = new Request(REQUEST_TYPE_CRUD_SYNC_PHONE_DELETE);
        request.setMemoryCacheEnabled(true);
        request.put(CrudSyncPhoneDeleteOperation.PARAM_USER_ID, userId);
        request.put(CrudSyncPhoneDeleteOperation.PARAM_PHONE_ID_LIST, phoneIdList);
        return request;
    }*/

    /**
     * Create the request to add a phone synchronously.
     *
     * @param userId the id of the user (generated by the application).
     * @param name the phone name.
     * @param manufacturer the phone manufacturer.
     * @param androidVersion the phone android version.
     * @param screenSize the phone screen size.
     * @param price the phone price.
     * @return The request.
     */
 /*   public static Request addSyncPhoneRequest(String userId, String name,
            String manufacturer, String androidVersion, double screenSize, int price) {
        Request request = new Request(REQUEST_TYPE_CRUD_SYNC_PHONE_ADD);
        return addEditSyncPhoneRequest(request, userId, -1, name, manufacturer,
                androidVersion, screenSize, price);
    }*/

    /**
     * Create the request to edit a phone synchronously.
     *
     * @param userId the id of the user (generated by the application).
     * @param phoneId the phone id.
     * @param name the phone new name.
     * @param manufacturer the phone new manufacturer.
     * @param androidVersion the phone new android version.
     * @param screenSize the phone new screen size.
     * @param price the phone new price.
     * @return The request.
     */
  /*  public static Request editSyncPhoneRequest(String userId, long phoneId, String name,
            String manufacturer, String androidVersion, double screenSize, int price) {
        Request request = new Request(REQUEST_TYPE_CRUD_SYNC_PHONE_EDIT);
        return addEditSyncPhoneRequest(request, userId, phoneId, name, manufacturer,
                androidVersion, screenSize, price);
    }*/

  /*  private static Request addEditSyncPhoneRequest(Request request, String userId,
            long phoneId, String name, String manufacturer, String androidVersion,
            double screenSize, int price) {
        request.setMemoryCacheEnabled(true);
        request.put(CrudSyncPhoneAddEditOperation.PARAM_USER_ID, userId);

        Phone phone = new Phone();
        phone.serverId = phoneId;
        phone.name = name;
        phone.manufacturer = manufacturer;
        phone.androidVersion = androidVersion;
        phone.screenSize = screenSize;
        phone.price = price;
        request.put(CrudSyncPhoneAddEditOperation.PARAM_PHONE, phone);
        return request;
    }*/

    

}
