// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.admanager.jaxws.v202011;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       Provides methods for creating, updating and retrieving {@link LiveStreamEvent} objects.
 *       
 *       <p>This feature is only available for Ad Manager 360 networks.
 *       Publishers will need to be activated through the <b>Video > Live streams</b>
 *       tab in the Ad Manager UI. For access, apply through your account manager.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "LiveStreamEventServiceInterface", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LiveStreamEventServiceInterface {


    /**
     * 
     *         Creates new {@link LiveStreamEvent} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link LiveStreamEvent#name}</li>
     *         <li>{@link LiveStreamEvent#startDateTime}</li>
     *         <li>{@link LiveStreamEvent#endDateTime}</li>
     *         <li>{@link LiveStreamEvent#contentUrls}</li>
     *         <li>{@link LiveStreamEvent#adTags}</li>
     *         </ul>
     *         
     *         @param liveStreamEvents the live stream events to create
     *         @return the created live stream events with their IDs filled in
     *       
     * 
     * @param liveStreamEvents
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202011.LiveStreamEvent>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
    @RequestWrapper(localName = "createLiveStreamEvents", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011", className = "com.google.api.ads.admanager.jaxws.v202011.LiveStreamEventServiceInterfacecreateLiveStreamEvents")
    @ResponseWrapper(localName = "createLiveStreamEventsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011", className = "com.google.api.ads.admanager.jaxws.v202011.LiveStreamEventServiceInterfacecreateLiveStreamEventsResponse")
    public List<LiveStreamEvent> createLiveStreamEvents(
        @WebParam(name = "liveStreamEvents", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
        List<LiveStreamEvent> liveStreamEvents)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Gets a {@link LiveStreamEventPage} of {@link LiveStreamEvent} objects that
     *         satisfy the given {@link Statement#query}. The following fields are
     *         supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     *         </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link LiveStreamEvent#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code slateCreativeId}</td>
     *         <td>{@link LiveStreamEvent#slateCreativeId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code assetKey}</td>
     *         <td>{@link LiveStreamEvent#assetKey}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code streamCreateDaiAuthenticationKeyIds}</td>
     *         <td>{@link LiveStreamEvent#streamCreateDaiAuthenticationKeyIds}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code dynamicAdInsertionType}</td>
     *         <td>{@link LiveStreamEvent#dynamicAdInsertionType}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code streamingFormat}</td>
     *         <td>{@link LiveStreamEvent#streamingFormat}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code customAssetKey}</td>
     *         <td>{@link LiveStreamEvent#customAssetKey}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code daiEncodingProfileIds}</td>
     *         <td>{@link LiveStreamEvent#daiEncodingProfileIds}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code segmentUrlAuthenticationKeyIds}</td>
     *         <td>{@link LiveStreamEvent#segmentUrlAuthenticationKeyIds}</td>
     *         </tr>
     *         </table>
     *         
     *         @param filterStatement a Publisher Query Language statement to filter a
     *         list of live stream events
     *         @return the live stream events that match the filter
     *       
     * 
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202011.LiveStreamEventPage
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
    @RequestWrapper(localName = "getLiveStreamEventsByStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011", className = "com.google.api.ads.admanager.jaxws.v202011.LiveStreamEventServiceInterfacegetLiveStreamEventsByStatement")
    @ResponseWrapper(localName = "getLiveStreamEventsByStatementResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011", className = "com.google.api.ads.admanager.jaxws.v202011.LiveStreamEventServiceInterfacegetLiveStreamEventsByStatementResponse")
    public LiveStreamEventPage getLiveStreamEventsByStatement(
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Performs actions on {@link LiveStreamEvent} objects that match the given
     *         {@link Statement#query}.
     *         
     *         @param liveStreamEventAction the action to perform
     *         @param filterStatement a Publisher Query Language statement used to filter
     *         a set of live stream events
     *         @return the result of the action performed
     *       
     * 
     * @param liveStreamEventAction
     * @param filterStatement
     * @return
     *     returns com.google.api.ads.admanager.jaxws.v202011.UpdateResult
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
    @RequestWrapper(localName = "performLiveStreamEventAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011", className = "com.google.api.ads.admanager.jaxws.v202011.LiveStreamEventServiceInterfaceperformLiveStreamEventAction")
    @ResponseWrapper(localName = "performLiveStreamEventActionResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011", className = "com.google.api.ads.admanager.jaxws.v202011.LiveStreamEventServiceInterfaceperformLiveStreamEventActionResponse")
    public UpdateResult performLiveStreamEventAction(
        @WebParam(name = "liveStreamEventAction", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
        LiveStreamEventAction liveStreamEventAction,
        @WebParam(name = "filterStatement", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
        Statement filterStatement)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Updates the specified {@link LiveStreamEvent} objects.
     *         
     *         @param liveStreamEvents the live stream events to update
     *         @return the updated live stream events
     *         @throws ApiException if there is an error updating the live stream events
     *       
     * 
     * @param liveStreamEvents
     * @return
     *     returns java.util.List<com.google.api.ads.admanager.jaxws.v202011.LiveStreamEvent>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
    @RequestWrapper(localName = "updateLiveStreamEvents", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011", className = "com.google.api.ads.admanager.jaxws.v202011.LiveStreamEventServiceInterfaceupdateLiveStreamEvents")
    @ResponseWrapper(localName = "updateLiveStreamEventsResponse", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011", className = "com.google.api.ads.admanager.jaxws.v202011.LiveStreamEventServiceInterfaceupdateLiveStreamEventsResponse")
    public List<LiveStreamEvent> updateLiveStreamEvents(
        @WebParam(name = "liveStreamEvents", targetNamespace = "https://www.google.com/apis/ads/publisher/v202011")
        List<LiveStreamEvent> liveStreamEvents)
        throws ApiException_Exception
    ;

}
